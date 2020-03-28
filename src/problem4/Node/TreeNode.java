package problem4.Node;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;


    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    //getter and setter method to access and initialise private variables
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
