class MyHashMap {
       int hashclone[];
    public MyHashMap() {
        hashclone=new int[1000001]; //due to test case 10^6
        Arrays.fill(hashclone,-1);//Intializes 1000 length hashclone array as -1(for get method if not present it has to return -1 so)
    }
    
    public void put(int key, int value) {
        hashclone[key]=value;//***Logic***/HashMap=(k,v)-->Int array[k]=v;
    }
    
    public int get(int key) {
        return hashclone[key];//hashmap.get(key) return value -->index[key] returns value
    }
    
    public void remove(int key) {
        hashclone[key]=-1; //if it is -1 then (anyway return -1 so the element is not present)
        //hashmap has inbuilt remove
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */