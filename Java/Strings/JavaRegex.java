// https://www.hackerrank.com/challenges/java-regex/problem

    String sub_reg_pattern = "(\\d{1,2}|[0-1]\\d{1,2}|[0-2][0-4]\\d|25[0-5])";
    String pattern = sub_reg_pattern + "\\." + sub_reg_pattern + "\\." + sub_reg_pattern + "\\." + sub_reg_pattern; 
