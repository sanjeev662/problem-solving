class Solution {
    public int openLock(String[] deadends, String target) {
        String start="0000";
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if(dead.contains(start)) return -1;
        if(start.equals(target)) return 0;

        Queue<String> q = new ArrayDeque<>();
        Set<String> seen=new HashSet<>();
        q.offer(start);
        seen.add(start);

        int turn=0;

        while(!q.isEmpty()){
            int size=q.size();
            turn++;

            while(size-->0){
                String st=q.poll();
                for(String stt: allpossible(st)){
                if(dead.contains(stt) ||  seen.contains(stt)) continue;
                else if(stt.equals(target)){
                    return turn;
                }
                else{
                    seen.add(stt);
                    q.offer(stt);
                }
                }

            }
        }

        return -1;
    }


    public List<String> allpossible(String temp){
        List<String> all=new ArrayList<>();
        char[] oldArr=temp.toCharArray();
        for(int i=0;i<4;i++){
            char old=oldArr[i];

            oldArr[i] = old == '0' ? '9': (char)(old-1);
            all.add(new String(oldArr));

            oldArr[i] = old == '9' ? '0': (char)(old+1);
            all.add(new String(oldArr));

            oldArr[i]=old;
        }
        return all;
    }
}