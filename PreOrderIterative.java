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

