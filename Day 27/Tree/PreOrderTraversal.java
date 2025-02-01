import org.w3c.dom.Node;

public class PreOrderTraversal {

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

    static class PreOrderTree{
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

        public void PreOrderTraversalTree(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            PreOrderTraversalTree(root.left);
            PreOrderTraversalTree(root.right);
        }
    }


   public static void main(String[] args) {
       int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       PreOrderTree t=new PreOrderTree();
       Node root=t.BuildTree(nodes);
       t.PreOrderTraversalTree(root);
   }
    
}