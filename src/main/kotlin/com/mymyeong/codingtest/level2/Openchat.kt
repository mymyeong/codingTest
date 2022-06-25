package com.mymyeong.codingtest.level2

class Openchat {

    class Chat(
        var userId: String,
        var message: String
    )

    fun solution(record: Array<String>): Array<String> {
        val userList = mutableMapOf<String, String>()
        val chatListForUserId: MutableList<Chat> = getChatListForUserId(record, userList)

        return changeUserIdToNickname(chatListForUserId, userList).toTypedArray()
    }

    private fun getChatListForUserId(
        recordList: Array<String>,
        userList: MutableMap<String, String>
    ): MutableList<Chat> {
        val chatListForUserId: MutableList<Chat> = mutableListOf()
        recordList.forEach {
            val recordLine = it.split(" ")
            val command = recordLine[0]
            val userId = recordLine[1]
            when (command) {
                "Enter" -> {
                    userList[userId] = recordLine[2]
                    chatListForUserId.add(Chat(userId, "${userId}님이 들어왔습니다."))
                }
                "Leave" -> {
                    chatListForUserId.add(Chat(userId, "${userId}님이 나갔습니다."))
                }
                "Change" -> {
                    userList[userId] = recordLine[2]
                }
            }
        }

        return chatListForUserId
    }

    private fun changeUserIdToNickname(
        chatList: MutableList<Chat>,
        userList: MutableMap<String, String>
    ): MutableList<String> {
        val result: MutableList<String> = mutableListOf()

        chatList.map {
            val nickName = userList[it.userId]
            if (nickName != null) {
                result.add(it.message.replace(it.userId, nickName))
            }
        }

        return result
    }
}