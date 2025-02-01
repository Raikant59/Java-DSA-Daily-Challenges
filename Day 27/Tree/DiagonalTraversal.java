import java.util.*;
public class DiagonalTraversal {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class tree{
        static int idx = -1;
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

        public void DiagonalTraversalTree(Node root){
           if(root == null){
             return;
           }
           Queue<Node> q = new LinkedList<>();
           q.add(root);
           while (q.size()>0) {
             Node curr=q.remove();
             while (curr != null) {
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                curr = curr.right;
             }
           }
        }
    }

    public static void main(String[] args) {
       int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       tree t=new tree();
       Node root=t.BuildTree(nodes);
       t.DiagonalTraversalTree(root);
    }
}
