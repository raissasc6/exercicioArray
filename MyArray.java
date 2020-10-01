package exercicio;


//Adicionar um elemento
//	Remover um elemento
//	Recuperar um elemento
public abstract class MyArray {
    int capacity;
    Integer[] array;

    MyArray(int capacity){
        setCapacity(capacity);
        Integer[] array = new Integer[capacity];
        setArray(array);
    }

    //método principal para add um novo elemento ao array
    public boolean addElement(int element){
        boolean add = false;
        Integer[] array1 = getArray();
        if(array1.length <= this.capacity){ //Confere se já atingiu a capacidade;

            if(array1.length == this.capacity){

                if(array1[array1.length-1]==null){ //se é o primerio elemento para add
                    array1[array1.length-1] = element; //adiciona o elemento ao array
                    add = true;
                    setArray(array1);
                }else{
                    Integer[] array2 = newArrayElemento(array1, element); //cria novo espaço e add o element
                    array1 = array2.clone(); // Clona o novo array no antigo Array
                    add = true;
                    setArray(array1);
                }
            }else{
                Integer[] array2 = newArrayElemento(array1, element); //cria novo espaço e add o element
                array1 = array2.clone(); // Clona o novo array no antigo Array
                add = true;
                setArray(array1);
            }
        }

        return add;
    }

    //método auxiliar para criar um novo espaço e add um novo elemento ao array
    private Integer[] newArrayElemento( Integer[] array, int element){
        Integer[] array2 = new Integer[array.length + 1 ]; //Cria um novo array com um espaço a mais
        array2[array2.length-1] = element;
        for(int i=0; i<array.length; i++){ //preenche o novo array com os dados do anterior
            array2[i] = array[i];
        }
        return array2;
    }

    //Método de busca elemento pela posição
    public Integer getElementsByInd(int indElement){
        return this.array[indElement];
    }

    //Método deleta elemento pela posição;
    public void delElement(int indElement){
        boolean find = false;
        Integer[] array2 = new Integer[this.array.length - 1 ]; //Cria um novo array com um espaço a menos
        for(int i=0; i<this.array.length-1; i++){ //prepara para preencher o novo array com os dados do anterior
            if(i == indElement) { //se indice é igual ao indice do elemento que deve ser excluido
                find = true; //aviso que o elemento foi encontrado
            }
            if(find){ //pula o indice do elemento encontrado da lista
                array2[i] = this.array[i+1];
            }else{
                array2[i] = this.array[i];
            }
        }
        this.array = array2.clone(); // Clona o novo array no antigo Array
    }


    public void setArray(Integer[] n){
        this.array = n.clone();
    }

    public Integer[] getArray(){
        return this.array;
    }

    public void setCapacity(int n){
        this.capacity = n;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
