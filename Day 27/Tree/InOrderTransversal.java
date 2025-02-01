public class InOrderTransversal {
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

    static class Tree{
        static int idx=-1;
        public Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }

        public void InOrderTraversalTree(Node root){
            if(root == null){
                return;
            }
            InOrderTraversalTree(root.left);
            System.out.print(root.data+" ");
            InOrderTraversalTree(root.right);
        }
    }


   public static void main(String[] args) {
       int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       Tree t=new Tree();
       Node root=t.BuildTree(nodes);
       t.InOrderTraversalTree(root);
   }
}
