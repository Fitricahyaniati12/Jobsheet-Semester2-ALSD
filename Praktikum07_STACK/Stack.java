/**
 * Stack
 */
public class Stack {

int data[];
int size;
int top;

public Stack (int size) {
    this.size = size;
    data = new int[size];
    top = -1;
}
public boolean isFull(){
    if (top == size-1){
    return true;
    }else
    return false;
}
public boolean isEmpty(){
    if (top == -1) {
        return true;
    } else
    {
        return false;    
    }
}
public void push(int dt){
    if (!isFull()){
        top++;
        data[top] = dt;
    }else{
        System.out.println("Stack Penuh");
    }
}
public void pop(){
    if (!isEmpty()){
        int x = data[top];
        top--;
        System.out.println("Data yang keluar dari stack: "+x);
    }else{
        System.out.println("Stack masih Kosong");
    }
}
public void peek(){
    if (!isEmpty()){
        System.out.println("Elemen Teratas stack: "+data[top]);
    }else{
        System.out.println("Stack Kosong");
    }
}
public void print () {
    System.out.println("Isi Stack: ");
    for (int i = top; i >= 0; i--){
        System.out.println(data[i]+" ");
    }
    System.out.println("");
}
public void clear(){
    if (!isEmpty()){
        for (int i = top; i >= 0; i--){
            top--;
        }
        System.out.println("Stack sudah dikosongkan");
    }else{
        System.out.println("Gagal! Stack masih kosong");
    
}
}
}