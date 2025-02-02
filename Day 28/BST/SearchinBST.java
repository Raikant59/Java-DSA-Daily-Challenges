public class SearchinBST {
    static class Node {
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
        
    }

    static class BST{
        public Node BuildTree(Node root,int val){
            if(root == null){
                root = new Node(val);
                return root;
            }
            if(root.data > val){
                root.left = BuildTree(root.left, val);
            }else if(root.data < val){
                root.right = BuildTree(root.right, val);
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

        public boolean Search(Node root,int key){
            if(root == null){
                return false;
            }
            if(root.data == key){
                return true;
            }else if (root.data > key){
                return Search(root.left, key);
            }else{
                return Search(root.right, key);
            }
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
        System.out.println();
        System.out.println(b.Search(root,1));
    }
}
