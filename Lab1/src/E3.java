
public class E3 {

    int x[];
    int numOfElements;

    public E3() {
        x=new int[5];
        numOfElements=0;

    }
    public int addElements (int e ){
        if(numOfElements<x.length){
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }
}
