    public class Node{
       public String data;
        public Node next;
        public Node prv;

        public  Node(String data){
        this.data = data;
    }
    }
class BrowserHistory {


    Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node nxt = new Node(url);
        curr.next = nxt;
        nxt.prv = curr;
        curr = curr.next;
    }
    
    public String back(int steps) {
        while(steps>0){
            if(curr.prv!=null){
                curr = curr.prv;
            }else{
                break;
            }
            steps--;
        }
        return curr.data;
    }
    
    public String forward(int steps) {
        while(steps>0){
            if(curr.next!=null){
                curr = curr.next;
            }else{
                break;
            }
            steps--;
        }
        return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */