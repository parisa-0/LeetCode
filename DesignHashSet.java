class MyHashSet {

    private LinkedList myList;

    public MyHashSet() {
        this.myList = new LinkedList();
    }
    
    public void add(int key) {
        if(!myList.contains(key)) {
            myList.add(key);
        }
    }
    
    public void remove(int key) {
       if(myList.contains(key)) {
             myList.remove(myList.indexOf(key));
        }
    }
    
    public boolean contains(int key) {
        return myList.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
