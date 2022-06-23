package com.mymyeong.codingtest.level1

class Openchat {

    enum class Command() {
        Enter(),
        Leave(),
        Change()
    }

    data class Chat(
        var command: Command,
        var userId : String,
        var nickName: String = ""
    )

    fun solution(record: Array<String>): Array<String> {
        val recordList = getRecordList(record)
        return getChatList(recordList)
    }

    private fun getChatList(recordList: List<Chat>): Array<String> {
        val userList = mutableMapOf<String, String>()

        val chatListForUserId: MutableList<String> = getChatListForUserId(recordList, userList)

        return changeUserIdToNickname(chatListForUserId, userList).toTypedArray()
    }

    private fun getChatListForUserId(
        recordList: List<Chat>,
        userList: MutableMap<String, String>
    ): MutableList<String> {
        val chatListForUserId: MutableList<String> = mutableListOf()
        recordList.forEach {
            when (it.command) {
                Command.Enter -> {
                    userList[it.userId] = it.nickName
                    chatListForUserId.add("${it.userId}님이 들어왔습니다.")
                }
                Command.Leave -> {
                    chatListForUserId.add("${it.userId}님이 나갔습니다.")
                }
                Command.Change -> {
                    userList[it.userId] = it.nickName
                }
            }
        }

        return chatListForUserId
    }

    private fun changeUserIdToNickname(
        chatList: MutableList<String>,
        userList: MutableMap<String, String>
    ): MutableList<String> {
        val result: MutableList<String> = mutableListOf()

        chatList.forEach { chatStr ->
            userList.keys.forEach { userId ->
                if (chatStr.contains(userId)) {
                    result.add(userList[userId]?.let { chatStr.replace(userId, it) }.toString())
                }
            }
        }

        return result
    }

    private fun getRecordList(record: Array<String>) = record.map {
        val chatArray = it.split(" ")

        when (val command = Command.valueOf(chatArray[0])) {
            Command.Leave -> Chat(command, chatArray[1])
            else -> Chat(command, chatArray[1], chatArray[2])
        }
    }.toList()
}