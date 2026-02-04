package reto6;
import java.util.HashMap;
import java.util.Map;

public class Reto6 {
    private static final Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen."));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira: Girando en modo fiesta."));

        comandos.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU?..."));
        comandos.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh... los bugs duermen."));
        comandos.put("ANALIZAR", () -> System.out.println("La máquina procesa: ¡Eres increíble programando!"));
    }

    public static void ejecutarComando(String comando) {
        Runnable accion = comandos.get(comando);
        if (accion != null) accion.run();
        else System.out.println("Comando no reconocido.");
    }
}
