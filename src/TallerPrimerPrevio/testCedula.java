/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPrimerPrevio;



public class testCedula {
    public static void main(String[] args) {
        int[] valores= {
        19144473, 19145954, 14666385, 10088765, 12800540, 11362812, 17325307, 19817369, 14734533, 12173720,
        11268463, 19503116, 19291907, 10208403, 10221087, 15305319, 18989962, 14868584, 18608502, 19877577,
        16386806, 16046909, 17541625, 15335134, 10821338, 19856426, 14120014, 15254164, 13235120, 15429160,
        12551565, 19955881, 16027141, 14900720, 13257894, 10149114, 12091028, 11840520, 16085785, 13362348,
        13196092, 11362634, 17563606, 12629115, 13097866, 17212847, 16616539, 11535353, 17289698, 13181738,
        12709603, 18306776, 17536815, 15326994, 15359075, 12382957, 13722810, 11446523, 19569963, 13965294,
        17672999, 14374562, 17536404, 19627876, 18648754, 18756552, 14708808, 13661648, 11430513, 16108430,
        13987771, 11171607, 14938677, 17896808, 15015835, 16420551, 10593739, 17695457, 14631137, 12678995,
        15210590, 19674932, 11159335, 18530549, 18524743, 18523669, 16254828, 14492197, 14020667, 11230858,
        16153849, 14976301, 13659990, 12418616, 13254152, 18750514, 12635331, 11432369, 15622216, 14182665
    };

        Cedula cedulas= new Cedula(valores);
        cedulas.ordenar();
         System.out.println("Las cedulas son: ");
        for(int i = 0 ; i < cedulas.getCedulas().length;i++){
            System.out.println(cedulas.getCedulas()[i]);
        }
        int a=cedulas.buscar(15622216);
        if(a==-1){
            System.out.println("No se encuentra");
        }
        else{
            System.out.println("Se encuentra en la posicion: "+a);
        }
        int b= 15622216;
        System.out.println("hay "+cedulas.mayores(b)+" mayores que "+b );
    
}
}
