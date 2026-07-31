class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();
        generate(n, parenthesis, new StringBuilder(), 0, 0);
        return parenthesis;
    }

    private void generate(
        int n, List<String> parenthesis, StringBuilder builder, int open, int close) {
        if (open + close == (2 * n)) {
            parenthesis.add(builder.toString());
            return;
        }

        if (open < n) {
            builder.append("(");
            generate(n, parenthesis, builder, open + 1, close);
            builder.deleteCharAt(builder.length() - 1);
        }

        if (close < open) {
            builder.append(")");
            generate(n, parenthesis, builder, open, close + 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
