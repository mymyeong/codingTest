public class Bamin4 {

    public String solution(String pathVariableUrl) {
        if (pathVariableUrl.matches("/payment/\\d{1,9}/[a-z]{1,9}") == false) {
            return "error";
        }
        String[] urls = pathVariableUrl.split("/");
        return "/" + urls[1] + "/" + urls[3] + "?paymentId=" + urls[2];
    }
}
