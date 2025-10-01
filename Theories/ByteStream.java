import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) {
        String inputFile = "entrada.txt"; //Arquivo de origem
        String outputFile = "saída.txt"; //Arquivo de destino

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            
            byte[] buffer = new byte[1024]; // Buffer de 1KB
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            
            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e) {
            System.out.println(">> Erro ao processar o arquivo: " + e.getMessage());
        }
    }
}

/*
 * Explicação:
 * 
 * 1. Abertuta dos Arquivos:
 * 
 * >> O FileInputStream abre o arquivo de entrada.txt
 * >>O FileOutputStream cria o saida.txt
 * 
 * 2. Uso de Buffer para Eficiência:
 * 
 * >> Criamos um buffer de 1024 bytes 
 * 
 * 3. Loop de Leitura e Escrita:
 * 
 * >> O método fis.read(buffer) 
 * >> O método fos.write(buffer, 0, bytesRead) 
 * >> Esse processo continua até que todos os dados sejam copiados
 * 
 * 4. Gerenciamento de Recursos:
 * 
 * >> O bloco try-with-resourcesdata
 * 
 * 5. Mensagens de Sucesso ou Erro:
 * 
 * >> Se o arquivo for copiado corretamente, o programa exibe "Arquivo * copiado com sucesso!"
 * >> Se ocorrer um erro, a mensagem ">> Erro ao processar arquivo"
 * 
 */