package dsa.training.brocode.stacks;

import java.util.Stack;

/* Stack example Brocode
Lifo Data structure, stores objects into a sort of "vertical tower"
push() to add to the top
pop() to remove from the top
 * @author Erick Borda
 * @note Uses of stacks?
 *  1. undo/redo features in text editors
 *  2. moving back/forward through browser history
 *  3. backtracking algorithms (maze, file directories)
 *  4. calling functions (call stack)
 * @note Check web page https://www.youtube.com/watch?v=CBYHwZcbD-s&t=289s
 */
public class StackExample {

    public static void exampleRemove() {
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlans");
        stack.push("FFVII");

        // ! this exmaple creates an error
        /*
         * stack.pop();
         * stack.pop();
         * stack.pop();
         * stack.pop();
         * stack.pop();
         */

        System.out.println("-> before remove");
        System.out.println(stack);
        String myFavGame = stack.pop();
        System.out.println("-> after remove");
        System.out.println(myFavGame);
        System.out.println(stack);

    }

    public static void examplePeek() {
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlans");
        stack.push("FFVII");

        String myFavGame = stack.peek();

        System.out.println(myFavGame);
        System.out.println(stack);

    }

    public static void exampleSearch() {
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlans");
        stack.push("FFVII");

        for (String game : stack) {
            System.out.println(stack.search(game));
        }

        System.out.println(stack);

    }

    public static void exampleWrongSearch() {
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlans");
        stack.push("FFVII");

        for (String game : stack) {
            System.out.println(stack.search(game));
        }

        System.out.println(stack.search("test"));

        System.out.println(stack);

    }

}
