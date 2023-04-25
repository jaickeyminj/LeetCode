class SmallestInfiniteSet {
    int store[];
    public SmallestInfiniteSet() {
        store = new int[1001];
        Arrays.fill(store,1);
    }
    
    public int popSmallest() {
        int pop=-1;
        for(int i=1;i<1001;i+=1){
            if(store[i]==1){
                pop=i;
                store[i]=0;
                break;
            }
        }
        return pop;
    }
    
    public void addBack(int num) {
        store[num]=1;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */