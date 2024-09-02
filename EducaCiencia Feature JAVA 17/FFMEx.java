import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public class FFMEx {

	public static void main(String[] args) {
		// PASSO 1: LINKAR A FUNÇÃO EXTRANGEIRA
		Linker linker = Linker.nativeLinker();
		SymbolLookup stdlib = linker.defaultLookup();
		MemorySegment strlenAddress = stdlib.find("strlen").orElseThrow();

		/* PASSO 2: DEFINIR OS ARGUMENTOS DE ENTRADA/SAÍDA 
		 			E CRIAR UM MANIPULADOR DO MÉTODO C EM JAVA
		*/
		FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
		MethodHandle strlen = linker.downcallHandle(strlenAddress, descriptor);

		// PASSO 3: GERENCIAR O HEAP DE MEMÓRIA 
		try (Arena offHeap = Arena.ofConfined()) {

			// STEP 4: CONVERTER A ENTRADA JAVA PARA A ENTRADA NATIVA
			MemorySegment funcArg = offHeap.allocateFrom("OLA MUNDO!");

			// PASSO 5: CHAMADA DA FUNÇÃO strlen
			long len = (long) strlen.invoke(funcArg);
			
			System.out.println(len);
		}
		catch (Throwable e) {
			
		}

	}

}
