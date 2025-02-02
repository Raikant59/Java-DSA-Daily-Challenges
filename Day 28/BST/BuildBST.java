
public class BuildBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BST{
        public Node BuildTree(Node root, int val){
            if(root == null){
                root = new Node(val);
                return root;
            }

            if(root.data < val){
                root.right = BuildTree(root.right, val);
            }else{
                root.left = BuildTree(root.left, val);
            }
            return root;
        }

        public void InOrderTransversal(Node root){
            if(root == null){
                return;
            }
            InOrderTransversal(root.left);
            System.out.print(root.data+" ");
            InOrderTransversal(root.right);
        }
    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        BST b = new BST();
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = b.BuildTree(root, values[i]);
        }

        b.InOrderTransversal(root);
    }
}
