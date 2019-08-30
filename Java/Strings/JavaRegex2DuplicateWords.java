//https://www.hackerrank.com/challenges/duplicate-word/problem

        //write your code here
        String regex = "(\\b\\w+\\b)(\\s\\b\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // Check for subsequences of input that match the compiled pattern
        while (m.find()) {
            input = input.replaceAll(m.group(), m.group(1));
        }
