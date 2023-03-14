package br.edu.fateczl.ordenacao;

public class Ordenacao_Vetor {

	public Ordenacao_Vetor() {
		super();
	}
	
	public int [] mergeSort(int[] vetor, int comeco, int fim ) {
		
		if(comeco<fim) {
			int meio = (comeco + fim)/2;
			mergeSort(vetor,comeco,meio);
			mergeSort(vetor, meio+1, fim);
			intercala(vetor,comeco,meio,fim);
		}
		System.out.print("Ordenação Merge Sort: ");	
		for( int valor: vetor) {
			System.out.print(valor + " ");
		}
		
		return vetor;
		
	}
	
	public void intercala(int[] vetor,int meio, int comeco, int fim ) {
		int vetorNovo[] = new int[vetor.length];
		for(int i = comeco; i < fim; i++) {
			vetorNovo[i] = vetor[i];
		}
		
		int esq = comeco;
		int dir = meio +1;
		
		for(int j = comeco; j<fim;j++) {
			if(esq>meio) {
				vetor[j] = vetorNovo[dir];
				dir++;
			}else if(dir>fim) {
				vetor[j] = vetorNovo[esq];
				esq++;
			}else if(vetorNovo[esq]<vetorNovo[dir]) {
				vetor[j] = vetorNovo[esq];
				esq++;
			}else {
				vetor[j] = vetorNovo[dir];
				dir++;
			}
			
		}
		
	}
	
	public int [] bublleSort(int[]vetor) {
		
		int tamanho = vetor.length;

		for (int i = 0; i < tamanho; i++) {
	        for (int j = 0; j < tamanho - 1; j++) {
	            if (vetor[j] > vetor[j+1]) {
	                int temp = vetor[j];
	                vetor[j] = vetor[j+1];
	                vetor[j+1] = temp;
	            }
	        }
	    }
		System.out.println("Ordenação Bubble Sort: ");
		for( int valor: vetor) {
			System.out.print(valor + " ");
		}
		return vetor;
	}
	
}


