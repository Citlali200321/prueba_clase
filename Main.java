import javax.swing.JOptionPane;
class Main {
public static void main(String [] args) {
  
JOptionPane.showMessageDialog(null,
 "Instituto Americano Cultural"+ "\n"
+ "     Cibernética II"+ "\n"
+ "Profesor: Aburto Castro Ingrid M."+ "\n"
+"Alumno: Santiago Martínez Citlali"+"\n"
+"Proyecto: Flower Sunny");
int opcion, eleccion,eleccion1,rosablanca,hortensia,florcera,margaritas,TOTALFLOR,TOTALFLOR1,tulipanes,dalias,lirios,clavel;
double Des,Des1,Descuento,Descuento1,Manobra,Manobra1,IVA,IVA1,TOTALIVA,TOTALIVA1,TOTALNETO,TOTALNETO1;
String elect,elect1,f1,f2,f3,f4,f5,f6,f7,f8;
String op=JOptionPane.showInputDialog("Selecciona un arreglo de flores:\n"
+"1.Ramo de mano (o bouquet) COSTO: $500\n"
+"2.Centro de mesa de flores elegante COSTO: $600\n"
+"3.Centro de mesa de plantas naturales COSTO: $250\n"
+"4.Corona de flores COSTO: $400\n"
+"5.Arreglo de flores colgante COSTO:$550\n"
+"6.Arreglo de flores en canasta COSTO:$450\n");
opcion=Integer.parseInt(op);
switch(opcion){
case 1:
JOptionPane.showMessageDialog(null, "1.Ramo de mano para San Valentín ALWAYS YOURS"+"\n"+"2.Ramo de mano para Día de las Madres DULCE AROMA"+"\n"+"3.Ramo de mano para Cumpleaños HAPPY PETALS"+"\n"+"4.Ramo de mano para Novia BRIGHT FLOWER"+"\n");
elect=JOptionPane.showInputDialog(null, "Ramo seleccionado:");
eleccion=Integer.parseInt(elect);
f1=JOptionPane.showInputDialog(null, "Cantidad deseada de rosas blancas:");
rosablanca=Integer.parseInt(f1);
f2=JOptionPane.showInputDialog(null, "Cantidad deseada de hortensias:");
hortensia=Integer.parseInt(f2);
f3=JOptionPane.showInputDialog(null, "Cantidad deseada de flor de cera:");
florcera=Integer.parseInt(f3);
f4=JOptionPane.showInputDialog(null, "Cantidad deseada de margaritas:");
margaritas=Integer.parseInt(f4);
TOTALFLOR=(rosablanca+hortensia+florcera+margaritas);
Des=(500*.20);
Descuento=(500-Des);
Manobra=(500+180);
IVA=(500*.15);
TOTALIVA=(500+IVA);
TOTALNETO=(Manobra+TOTALIVA);
if(TOTALFLOR>=300){
  JOptionPane.showMessageDialog(null, "TOTAL DE FLORES PARA SU RAMO:"+TOTALFLOR+"\n"+"FELICIDADES, TIENE UN DESCUENTO DEL 20%"+"\n"+"COSTO DEL RAMO: $500"+"\n"+"COSTO DEL RAMO CON DESCUENTO:"+Descuento+"\n"+"GRACIAS POR SU COMPRA, VUELVA PRONTO");
}
else{
JOptionPane.showMessageDialog(null, "TOTAL DE FLORES PARA SU RAMO:"+TOTALFLOR+"\n"+ "EL COSTO DEL RAMO ES: $500"+"\n"+"COSTO DEL RAMO INCLUYENDO LA MANO DE OBRA:"+Manobra+"\n"+"DEBIDO A LAS POLÍTICAS DE LA FLORERÍA, SE LE COBRARÁ UN 15% DE IVA"+"\n"+"COSTO FINAL DEL RAMO CON IVA Y LA MANO DE OBRA:"+TOTALNETO+"\n"+"GRACIAS POR SU COMPRA, VUELVA PRONTO");
}
break;
case 2:
JOptionPane.showMessageDialog(null, "1.Centro de mesa de flores elegante para Cumpleaños SUNNY FEST"+
"\n"+"2.Centro de mesa de flores elegante para Boda ALWAYS TOGETHER"+"\n"+"3.Centro de mesa de flores elegante para comedor FEEL ALIVE"+"\n"+"4.Centro de mesa de flores elegante para Bautizo FRESH SCENT"+"\n");
elect1=JOptionPane.showInputDialog(null, "Centro de mesa de flores seleccionado");
eleccion1=Integer.parseInt(elect1);
f5=JOptionPane.showInputDialog(null, "Cantidad deseada de tulipanes:");
tulipanes=Integer.parseInt(f5);
f6=JOptionPane.showInputDialog(null, "Cantidad deseada de dalias:");
dalias=Integer.parseInt(f6);
f7=JOptionPane.showInputDialog(null, "Cantidad deseada de lirios:");
lirios=Integer.parseInt(f7);
f8=JOptionPane.showInputDialog(null, "Cantidad deseada de claveles:");
clavel=Integer.parseInt(f8);
TOTALFLOR1=(tulipanes+dalias+lirios+clavel);
Des1=(600*.30);
Descuento1=(600-Des1);
Manobra1=(600+180);
IVA1=(600*.15);
TOTALIVA1=(600+IVA1);
TOTALNETO1=(Manobra1+TOTALIVA1);
if(TOTALFLOR1>=200){
  JOptionPane.showMessageDialog(null, "TOTAL DE FLORES PARA SU CENTRO DE MESA DE FLORES ELEGANTE:"+TOTALFLOR1+"\n"+"FELICIDADES, TIENE UN DESCUENTO DEL 30%"+"\n"+"COSTO DEL CENTRO DE MESA DE FLORES ELEGANTE:$600"+"\n"+"COSTO DEL CENTRO DE MESA DE FLORES ELEGANTE CON DESCUENTO:"+Descuento1+"\n"+"GRACIAS POR SU COMPRA, VUELVA PRONTO");
}
else{
  JOptionPane.showMessageDialog(null, "TOTAL DE FLORES PARA SU CENTRO DE MESA ELEGANTE:"+TOTALFLOR1);
  break;

}}}}