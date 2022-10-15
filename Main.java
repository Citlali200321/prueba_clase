import javax.swing.JOptionPane;
class Main {
public static void main(String [] args) {
  
JOptionPane.showMessageDialog(null,
 "Instituto Americano Cultural"+ "\n"
+ "        Cibernética II"+ "\n"
+ "Profesor: Aburto Castro Ingrid M."+ "\n"
+"Alumno: Santiago Martínez Citlali"+"\n"
+"Proyecto: Flower Sunny");
int opcion,eleccion,rosablanca,hortensia,florcera,margaritas,TOTALFLOR,tulipanes,dalias,lirios,clavel,lavanda,cactus,suculentas,diente,liliums,sp,gerberas,rosaroja,campanulas,geranios,diascias,surfinias,girasoles,crisantemos,magnolias,fc;
double Des,Descuento,Manobra,IVA,TOTALNETO;
String elect,f1,f2,f3,f4;
String op=JOptionPane.showInputDialog("Selecciona un arreglo de flores:\n"
+"1.Ramo de mano (o bouquet) |||COSTO: $500|||\n"
+"2.Centro de mesa de flores elegante |||COSTO: $600|||\n"
+"3.Centro de mesa de plantas naturales |||COSTO: $250|||\n"
+"4.Corona de flores |||COSTO: $400|||\n"
+"5.Arreglo de flores colgante |||COSTO:$550|||\n"
+"6.Arreglo de flores en canasta |||COSTO:$450|||\n");
opcion=Integer.parseInt(op);
switch(opcion){
case 1:
JOptionPane.showMessageDialog(null, "1.Ramo de mano para San Valentín ~ALWAYS YOURS~"+"\n"+"2.Ramo de mano para Día de las Madres ~DULCE AROMA~"+"\n"+"3.Ramo de mano para Cumpleaños ~HAPPY PETALS~"+"\n"+"4.Ramo de mano para Novia ~BRIGHT FLOWER~"+"\n");
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
Manobra=(500+180.50);
IVA=(500*.15);
TOTALNETO=(Manobra+IVA);
JOptionPane.showMessageDialog(null, "La cantidad total de flores para su ramo es:"+TOTALFLOR);
if(TOTALFLOR>=300){
  JOptionPane.showMessageDialog(null, "¡¡FELICIDADES!!, TIENE UN DESCUENTO DEL 20%"+"\n"+"COSTO DEL RAMO: $500"+"\n"+"COSTO DEL RAMO CON DESCUENTO:"+Descuento+"\n"
  +"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
else{
JOptionPane.showMessageDialog(null, "EL COSTO DEL RAMO ES: $500"+"\n"+"COSTO DEL RAMO INCLUYENDO LA MANO DE OBRA ($180.50):"+Manobra+"\n"+"***DEBIDO A LAS POLÍTICAS DE LA FLORERÍA, SE LE COBRARÁ UN 15% DE IVA***"+"\n"+"COSTO FINAL DEL RAMO CON IVA Y LA MANO DE OBRA:"+TOTALNETO+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
break;
case 2:
JOptionPane.showMessageDialog(null, "1.Centro de mesa de flores elegante para Cumpleaños ~SUNNY FEST~"+"\n"+"2.Centro de mesa de flores elegante para Boda ~ALWAYS TOGETHER~"+"\n"+"3.Centro de mesa de flores elegante para Comedor ~FEEL ALIVE~"+"\n"+"4.Centro de mesa de flores elegante para Bautizo ~FRESH SCENT~"+"\n");
elect=JOptionPane.showInputDialog(null, "Centro de mesa de flores elegante seleccionado:");
eleccion=Integer.parseInt(elect);
f1=JOptionPane.showInputDialog(null, "Cantidad deseada de tulipanes:");
tulipanes=Integer.parseInt(f1);
f2=JOptionPane.showInputDialog(null, "Cantidad deseada de dalias:");
dalias=Integer.parseInt(f2);
f3=JOptionPane.showInputDialog(null, "Cantidad deseada de lirios:");
lirios=Integer.parseInt(f3);
f4=JOptionPane.showInputDialog(null, "Cantidad deseada de claveles:");
clavel=Integer.parseInt(f4);
TOTALFLOR=(tulipanes+dalias+lirios+clavel);
Des=(600*.30);
Descuento=(600-Des);
Manobra=(600+180.50);
IVA=(600*.15);
TOTALNETO=(Manobra+IVA);
JOptionPane.showMessageDialog(null, "La cantidad total de flores para su centro de mesa de flores elegante es:"+TOTALFLOR);
if(TOTALFLOR>=200){
  JOptionPane.showMessageDialog(null, "¡¡FELICIDADES!!, TIENE UN DESCUENTO DEL 30%"+"\n"+"COSTO DEL CENTRO DE MESA DE FLORES ELEGANTE:$600"+"\n"+"COSTO DEL CENTRO DE MESA DE FLORES ELEGANTE CON DESCUENTO:"+Descuento+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
else{
  JOptionPane.showMessageDialog(null, "COSTO DEL CENTRO DE MESA DE FLORES ELEGANTE:$600"+"\n"+"COSTO DEL CENTRO DE MESA DE FLORES ELEGANTE INCLUYENDO LA MANO DE OBRA ($180.50):"+Manobra+"\n"+"***DEBIDO A LAS POLÍTICAS DE LA FLORERÍA, SE LE COBRARÁ UN 15% DE IVA***"+"\n"+"COSTO FINAL DEL CENTRO DE MESA DE FLORES ELEGANTE CON IVA Y LA MANO DE OBRA:"+TOTALNETO+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
break;
case 3:
JOptionPane.showMessageDialog(null, "1.Centro de mesa de plantas naturales para Exteriores ~BRIGHT SUN~"+"\n"+"2.Centro de mesa de plantas naturales para Interiores ~WILD SCENT~"+"\n"+"3.Centro de mesa de plantas naturales para Eventos ~THOUSAND WISHES~"+"\n"+"4.Centro de mesa de plantas naturales para Regalo ~ALWAYS FINE~"+"\n");
elect=JOptionPane.showInputDialog(null, "Centro de mesa de plantas naturales seleccionado:");
eleccion=Integer.parseInt(elect);
f1=JOptionPane.showInputDialog(null, "Cantidad deseada de lavandas:");
lavanda=Integer.parseInt(f1);
f2=JOptionPane.showInputDialog(null, "Cantidad deseada de cactus:");
cactus=Integer.parseInt(f2);
f3=JOptionPane.showInputDialog(null, "Cantidad deseada de suculentas:");
suculentas=Integer.parseInt(f3);
f4=JOptionPane.showInputDialog(null, "Cantidad deseada de diente de león:");
diente=Integer.parseInt(f4);
TOTALFLOR=(lavanda+cactus+suculentas+diente);
Des=(250*.10);
Descuento=(250-Des);
Manobra=(250+180.50);
IVA=(250*.15);
TOTALNETO=(Manobra+IVA);
JOptionPane.showMessageDialog(null, "La cantidad total de flores para su centro de mesa de plantas naturales es:"+TOTALFLOR);
if(TOTALFLOR>=25){
  JOptionPane.showMessageDialog(null, "¡¡FELICIDADES!!, TIENE UN DESCUENTO DEL 10%"+"\n"+"COSTO DEL CENTRO DE MESA DE PLANTAS NATURALES: $250"+"\n"+"COSTO DEL CENTRO DE MESA DE PLANTAS NATURALES CON DESCUENTO:"+Descuento+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
else{
JOptionPane.showMessageDialog(null, "COSTO DEL CENTRO DE MESA DE PLANTAS NATURALES: $250"+"\n"+"COSTO DEL CENTRO DE MESA DE PLANTAS NATURALES INCLUYENDO LA MANO DE OBRA ($180.50):"+Manobra+"\n"+"***DEBIDO A LAS POLÍTICAS DE LA FLORERÍA, SE LE COBRARÁ UN 15% DE IVA***"+"\n"+"COSTO FINAL DEL CENTRO DE MESA DE PLANTAS NATURALES CON IVA Y LA MANO DE OBRA:"+TOTALNETO+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
break;
case 4:
JOptionPane.showMessageDialog(null, "1.Corona de flores para Boda ~SCARLET MOON~"+"\n"+"2.Corona de flores para Panteón ~REMEMBER ME~"+"\n"+"3.Corona de flores para Cumpleaños ~MOMENTS~"+"\n"+"4.Corona de flores para Bautizo ~SWEET SCENT~"+"\n");
elect=JOptionPane.showInputDialog(null, "Corona de flores seleccionada:");
eleccion=Integer.parseInt(elect);
f1=JOptionPane.showInputDialog(null, "Cantidad deseada de liliums:");
liliums=Integer.parseInt(f1);
f2=JOptionPane.showInputDialog(null, "Cantidad deseada de siempre vivas:");
sp=Integer.parseInt(f2);
f3=JOptionPane.showInputDialog(null, "Cantidad deseada de gerberas:");
gerberas=Integer.parseInt(f3);
f4=JOptionPane.showInputDialog(null, "Cantidad deseada de rosas rojas:");
rosaroja=Integer.parseInt(f4);
TOTALFLOR=(liliums+sp+gerberas+rosaroja);
Des=(400*.15);
Descuento=(400-Des);
Manobra=(400+180.50);
IVA=(400*.15);
TOTALNETO=(Manobra+IVA);
JOptionPane.showMessageDialog(null, "La cantidad total de flores para su corona de flores es:"+TOTALFLOR);
if(TOTALFLOR>=250){
  JOptionPane.showMessageDialog(null, "¡¡FELICIDADES!!, TIENE UN DESCUENTO DEL 15%"+"\n"+"COSTO DE LA CORONA DE FLORES: $400"+"\n"+"COSTO DE LA CORONA DE FLORES CON DESCUENTO:"+Descuento+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
else{
JOptionPane.showMessageDialog(null, "COSTO DE LA CORONA DE FLORES: $400"+"\n"+"COSTO DE LA CORONA DE FLORES INCLUYENDO LA MANO DE OBRA ($180.50):"+Manobra+"\n"+"***DEBIDO A LAS POLÍTICAS DE LA FLORERÍA, SE LE COBRARÁ UN 15% DE IVA***"+"\n"+"COSTO FINAL DE LA CORONA DE FLORES CON IVA Y LA MANO DE OBRA:"+TOTALNETO+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
break;
case 5:
JOptionPane.showMessageDialog(null, "1.Arreglo de flores colgante para Boda ~MAGIC STAR~"+"\n"+"2.Arreglo de flores colgante para XV años ~FOREVER YOUNG~"+"\n"+"3.Arreglo de flores colgante para Eventos Escolares ~MOONSTONE~"+"\n"+"4.Arreglo de flores colgante para Interiores ~HAPPY FLOWER~"+"\n");
elect=JOptionPane.showInputDialog(null, "Arreglo de flores colgante seleccionado:");
eleccion=Integer.parseInt(elect);
f1=JOptionPane.showInputDialog(null, "Cantidad deseada de campanulas:");
campanulas=Integer.parseInt(f1);
f2=JOptionPane.showInputDialog(null, "Cantidad deseada de geranios:");
geranios=Integer.parseInt(f2);
f3=JOptionPane.showInputDialog(null, "Cantidad deseada de diascias:");
diascias=Integer.parseInt(f3);
f4=JOptionPane.showInputDialog(null, "Cantidad deseada de surfinias:");
surfinias=Integer.parseInt(f4);
TOTALFLOR=(campanulas+geranios+diascias+surfinias);
Des=(550*.13);
Descuento=(550-Des);
Manobra=(550+180.50);
IVA=(550*.15);
TOTALNETO=(Manobra+IVA);
JOptionPane.showMessageDialog(null, "La cantidad total de flores para su arreglo de flores colgante es:"+TOTALFLOR);
if(TOTALFLOR>=150){
  JOptionPane.showMessageDialog(null, "¡¡FELICIDADES!!, TIENE UN DESCUENTO DEL 13%"+"\n"+"COSTO DEL ARREGLO DE FLORES COLGANTE: $550"+"\n"+"COSTO DEL ARREGLO DE FLORES COLGANTE CON DESCUENTO:"+Descuento+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
else{
JOptionPane.showMessageDialog(null, "COSTO DEL ARREGLO DE FLORES COLGANTE: $550"+"\n"+"COSTO DEL ARREGLO DE FLORES COLGANTE INCLUYENDO LA MANO DE OBRA ($180.50):"+Manobra+"\n"+"***DEBIDO A LAS POLÍTICAS DE LA FLORERÍA, SE LE COBRARÁ UN 15% DE IVA***"+"\n"+"COSTO FINAL DEL ARREGLO DE FLORES COLGANTE CON IVA Y LA MANO DE OBRA:"+TOTALNETO+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
break;
case 6:
JOptionPane.showMessageDialog(null, "1.Arreglo de flores en canasta para Cumpleaños ~GOLDEN RIBBONS~"+"\n"+"2.Arreglo de flores en canasta para Primera Comunión ~BEAUTIFUL BEGINNINGS~"+"\n"+"3.Arreglo de flores en canasta para Pascua ~YELLOW SPRING~"+"\n"+"4.Arreglo de flores en canasta para el Día de las Madres ~CUTE GEM~"+"\n");
elect=JOptionPane.showInputDialog(null, "Arreglo de flores en canasta seleccionado:");
eleccion=Integer.parseInt(elect);
f1=JOptionPane.showInputDialog(null, "Cantidad deseada de girasoles:");
girasoles=Integer.parseInt(f1);
f2=JOptionPane.showInputDialog(null, "Cantidad deseada de crisantemos:");
crisantemos=Integer.parseInt(f2);
f3=JOptionPane.showInputDialog(null, "Cantidad deseada de magnolias:");
magnolias=Integer.parseInt(f3);
f4=JOptionPane.showInputDialog(null, "Cantidad deseada de flor de cerezo:");
fc=Integer.parseInt(f4);
TOTALFLOR=(girasoles+crisantemos+magnolias+fc);
Des=(450*.16);
Descuento=(450-Des);
Manobra=(450+180.50);
IVA=(450*.15);
TOTALNETO=(Manobra+IVA);
JOptionPane.showMessageDialog(null, "La cantidad total de flores para su arreglo de flores en canasta es:"+TOTALFLOR);
if(TOTALFLOR>=100){
  JOptionPane.showMessageDialog(null, "¡¡FELICIDADES!!, TIENE UN DESCUENTO DEL 16%"+"\n"+"COSTO DEL ARREGLO DE FLORES EN CANASTA: $450"+"\n"+"COSTO DEL ARREGLO DE FLORES EN CANASTA CON DESCUENTO:"+Descuento+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
else{
JOptionPane.showMessageDialog(null, "COSTO DEL ARREGLO DE FLORES EN CANASTA: $450"+"\n"+"COSTO DEL ARREGLO DE FLORES EN CANASTA INCLUYENDO LA MANO DE OBRA ($180.50):"+Manobra+"\n"+"***DEBIDO A LAS POLÍTICAS DE LA FLORERÍA, SE LE COBRARÁ UN 15% DE IVA***"+"\n"+"COSTO FINAL DEL ARREGLO DE FLORES EN CANASTA CON IVA Y LA MANO DE OBRA:"+TOTALNETO+"\n"+"GRACIAS POR SU COMPRA, ¡VUELVA PRONTO!");
}
break;
}}}