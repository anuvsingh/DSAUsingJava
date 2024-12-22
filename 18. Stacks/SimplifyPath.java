import java.util.Stack;

public class SimplifyPath {             // UNIX STYLE FOLDER NAME

    public static String simplify(String A) {
        Stack<String> st = new Stack<String>();
        String res = "/";
        int len_A = A.length();

        for (int i = 0; i < len_A; i++) {
            String dir = "";

            // Skip the '/' characters
            while (i < len_A && A.charAt(i) == '/') {
                i++;
            }

            // Read the current directory or file name
            while (i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }

            // If the directory is "..", pop the stack (move up one directory)
            if (dir.equals("..")) {
                if (!st.empty()) {
                    st.pop();
                }
            }
            // If the directory is ".", do nothing (current directory)
            else if (dir.equals(".")) {
                continue;
            }
            // If the directory name is not empty, push it onto the stack
            else if (dir.length() != 0) {
                st.push(dir);
            }
        }

        // If the stack is empty, return "/"
        if (st.empty()) {
            return res;
        }

        // Build the final simplified path
        while (!st.empty()) {
            res = "/" + st.pop() + res;
        }

        // If the final path is empty, return "/"
        return res.equals("") ? "/" : res;
    }

    public static void main(String[] args) {
        String str = "/a/./b/../../c/";
        String res = simplify(str);
        System.out.println(res); // Output: "/c/"
    }
}