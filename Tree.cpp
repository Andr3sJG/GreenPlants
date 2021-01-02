#include <iostream>
using namespace std;

struct Node{
   int val;
   Node* R;
   Node* L;
   Node(int v){
      val = v; R = NULL, L= NULL;
   }
};

class Tree{
   private:
      Node* root;
   public:
      Tree();
      Tree(int v){
         root = new Node(v);
      }



      void printTree(){
         cout << root->val << endl;
      }
};

