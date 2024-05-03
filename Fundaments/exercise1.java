/********************************************************
                AULA 01 - 29/04/2024

    compactação de binários para otimização de memória 

*********************************************************/

// mesmo nome do arquivo
public class exercise1
{
    // main (?)
    public static void main(String[] args)
    {
        // declara uma variável chamada array que guarda um vetor de inteiros declarados ali mesmo
        int[] array = new int[] {
            244, 232, 241, 123,
            232, 64, 111, 140
        };
 
        // declara uma variável chamada result que recebe o retorno da função compact
        int[] result = compact(array);

        // printa os itens de result
        System.out.printf("\nDados compactados: ");

        for (int i = 0; i < result.length; i++){
        System.out.printf("%d ", result[i]);
        }

        // declara uma variável chamada resultDecompact que recebe o retorno da função decompact
        int[] resultDecompact = decompact(result);

        // printa os itens de resultDecompact
        System.out.printf("\nDados restaurados à 1byte: ");

        for (int i = 0; i < resultDecompact.length; i++){
        System.out.printf("%d ", resultDecompact[i]);
        }

    }

    // declara uma função que retorna um vetor de inteiros
    static int[] compact(int[] originalData)
    {

        // cria um vetor com metade do tamanho 
        int[] result_array = new int[originalData.length / 2];
        
        for (int i = 0; i < originalData.length / 2; i++){

        /************************************************************************************************************************ 

                cada item do result_array receberá os 4 primeiros bits do número somado aos 4 últimos do segundo número
        
            os 4 primeiros bits são determinados pelo AND com 11110000, que retornará somente os 4 primeiros bits do número
        
                                                = ((originalData[2 * i] >> 4)<<4)

        *************************************************************************************************************************/
            result_array[i] = (originalData[2 * i] & 240) + (originalData[2 * i + 1] >> 4);
        }
        
        return result_array;
    }

    static int[] decompact(int[] originalDataCompact){
        int j = 0;
        int[] decompactedArray = new int[originalDataCompact.length * 2];

        for (int i = 0; i < originalDataCompact.length; i++){
                    decompactedArray[j] = (originalDataCompact[i] & 240);
                    j++;
                    decompactedArray[j] = ((originalDataCompact[i] & 15) << 4);
                    j++;

            }
            
            // eu tentei
            
            // for (int i = 0; i < decompactedArray.length; i++){
            //     decompactedArray[i] = (originalDataCompact[j] & 240);
            //     decompactedArray[i] = ((originalDataCompact[j] & 15) << 4);
            //     j++;
    
            // }

        return decompactedArray;
    }
}