//3280. Convert Date to Binary


class Solution {
    public String convertDateToBinary(String date) {
        String year = date.substring(0,4);
        String month = date.substring(5,7);
        String day = date.substring(8,10);
        StringBuilder str = new StringBuilder();
        str.append(Integer.toBinaryString(Integer.parseInt(year)));
        str.append("-");
        str.append(Integer.toBinaryString(Integer.parseInt(month)));
        str.append("-");
        str.append(Integer.toBinaryString(Integer.parseInt(day)));
        return str.toString();
    }
}
