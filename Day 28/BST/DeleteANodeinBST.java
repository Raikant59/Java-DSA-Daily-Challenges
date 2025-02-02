public class DeleteANodeinBST {
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

       public Node delete(Node root , int key){
            if(root == null){
                return root;
            }
            if(root.data > key){
                root.left = delete(root.left, key);
            }else if(root.data < key){
                root.right = delete(root.right, key);
            }else{
                if(root.right == null && root.left == null){
                    return null;
                }

                if(root.right == null){
                    return root.left;
                }else if(root.left == null){
                    return root.right;
                }

                int min = findval(root.right);
                root.data = min;
                root.right = delete(root.right, min);
            }
            return root;
       }

       static int findval(Node node){
            int min = node.data;
            while( node.left != null){
                min = node.left.data;
                node = node.left;
            }
            return min;
       }
    }

    public static void main(String[] args) {
        int values[]={5,1,3,2,4,7};
        BST b = new BST();
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = b.BuildTree(root, values[i]);
        }

        b.InOrderTransversal(root);
        System.out.println();
        b.delete(root,3);
        b.InOrderTransversal(root);
    }

    
}
