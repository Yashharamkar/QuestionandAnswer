import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
    }
}

Node root;

class Binnary{
    public void create(){}
    Node first=new Node(1);
    Node second =new Node(2);
    Node third =new Node(3);

    Node root=first;
    first.left=second;
    first.right=third;
}
public void preOrder(){
if(root=null){
return;
}
Stack<TreeNode> tr=new Stack<>();
Stack.push(root);
while(!stack.isEmpty()){
    tr temp=stack.pop();
    System.out.println(temp.data);
    if(tr.right!=null){
        stack.push(tr.data);
    }
    if(tr.left!=null){
        stack.push(tr.data);
    }
}
}

public static void main(String args[]){
    Binnary bt= new Binnary();  
    bt.create();
    bt.preOrder();
}
}