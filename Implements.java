package exercicio;

public class Implements extends MyArray {


    Implements(int capacity) {
        super(capacity);
    }


    public void addElementAndFold2(int n){
        int cap = this.getCapacity();
        if(this.addElement(n)){ //confere tamanho existente
            showArray();
        }else{
            cap = cap *2;
            System.out.println("\n**Chegou no limite, dobrando tamanho de "+this.getCapacity()+ " para "+cap);
            this.setCapacity(cap);
            addElementAndFold2(n);
        }
    }

    public void addElementAndFoldHalf(int n){
        int cap = this.getCapacity();
        if(this.addElement(n)){ //confere tamanho existente
            showArray();
        }else{
            if(cap <= 1){
                cap = 2;
            }else{
                cap = (int) (cap * 1.5);
            }
            System.out.println("\n**Chegou no limite, aumentando 50% do tamanho. De "+this.getCapacity()+ " para "+cap);
            this.setCapacity(cap);
            addElementAndFoldHalf(n);
        }


    }

    public void addElementWithLimit(int n){
        int cap = this.getCapacity();
        System.out.println("capacidade: "+cap);
        if(this.addElement(n)){ //confere tamanho existente
            showArray();
        }else{
            System.out.println("\n ****O ARRAY CHEGOU NO LIMITE!");
            showArray();
        }


    }
    
    public void showArray(){
        Integer[] array= this.getArray();
        System.out.println("\n___________________");
        System.out.print("  Array:");
        for(int i=0; i< array.length; i++){
            if(array[i]!=null) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n___________________\n ");
    }


}
