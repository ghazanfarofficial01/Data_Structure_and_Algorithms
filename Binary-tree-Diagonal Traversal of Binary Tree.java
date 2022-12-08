class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           ArrayList<Integer> list = new ArrayList<>();
           if(root == null) return list;
           
           Map<Integer,ArrayList<Integer> > map = new TreeMap<>();
           
           d_help(root,map,0);
           
           for(Map.Entry<Integer,ArrayList<Integer> > entry : map.entrySet()){
               list.addAll(entry.getValue());
           }
           return list;
      }
      
      public void d_help(Node root,Map<Integer,ArrayList<Integer> > map,int level){
          if(root == null) return;
          
          if(map.containsKey(level)){
              map.get(level).add(root.data);
          }
          else{
              map.put(level,new ArrayList<Integer>(Arrays.asList(root.data)));
          }
          
          d_help(root.left,map,level+1);
          d_help(root.right,map,level);
          
      }
}
