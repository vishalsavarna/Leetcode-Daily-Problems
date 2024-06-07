//648. Replace Words

//Not a clean code baby!!
//taken help from Lsoln

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for(String word : dictionary){
            trie.insert(word);
        }

        StringBuilder result = new StringBuilder();
        String input[] = sentence.split(" ");
        for(String x : input){
            result.append(trie.startsWith(x));
            result.append(" ");
        }

        return result.toString().trim();
        //return sentence;

    }


    //Taken help from Striver's playlist of trie.
    static class Trie {
        static class Node{
            Node links[] = new Node[26];
            boolean flag=false;

            boolean containsKey(char ch){
                return links[ch-'a']!=null;
            }

            void put(char ch, Node node){
                links[ch-'a']=node; //adding reference trie
            }

            Node get(char ch){
                return links[ch-'a'];
            }

            void setEnd(){
                flag=true;
            }

            boolean isEnd(){
                return flag;
            }
        }

        private Node root;

        //constructor to initialize 
        public Trie() {
            root = new Node();
        }
        
        public void insert(String word) {
            Node node = root;
            for(int i=0;i<word.length();i++){
                if(!node.containsKey(word.charAt(i))){
                    node.put(word.charAt(i),new Node());
                }
                node = node.get(word.charAt(i));
            }
            node.setEnd();
        }
        
        public boolean search(String word) {
            Node node = root;
            for(int i=0;i<word.length();i++){
                if(!node.containsKey(word.charAt(i))) return false;

                node = node.get(word.charAt(i));
            }
            return node.isEnd();
            
        }
        
        public String startsWith(String prefix) {
            Node node = root;
            for(int i=0;i<prefix.length();i++){
                if(!node.containsKey(prefix.charAt(i)) && !node.isEnd()) return prefix;
                else if(node.isEnd()) return prefix.substring(0,i);

                node = node.get(prefix.charAt(i));
            }
            return prefix; //just this statement change for startsWith() compared to search()
        }
    }

}
