class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/"); // split by slash
        Stack<String> stack = new Stack<>();

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue; // ignore empty or current directory
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); // go back one directory
                }
            } else {
                stack.push(part); // valid directory name
            }
        }

        // Build simplified path
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        return simplifiedPath.length() == 0 ? "/" : simplifiedPath.toString();
    }
}
