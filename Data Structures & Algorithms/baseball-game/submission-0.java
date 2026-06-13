class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> points = new Stack();
        Integer top = 0;
        for (String operation : operations) {
            try {
                points.add(Integer.parseInt(operation));
            } catch (NumberFormatException ex) {
                top = points.get(points.size() - 1);
                if (operation.equalsIgnoreCase("d")) {
                    points.add((2 * top));
                } else if (operation.equalsIgnoreCase("+")) {
                    points.add(top + points.get(points.size() - 2));
                } else if (operation.equalsIgnoreCase("c")) {
                    points.remove(top);
                } else {
                    continue;
                }
            }
        }
        return points.stream().mapToInt(Integer::intValue).sum();
    }
}