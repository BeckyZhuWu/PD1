
public class Rectangulo { 

    private double coo1x; 
    private double coo1y; 
    private double coo2x; 
    private double coo2y; 
    private double coo3x; 
    private double coo3y; 
    private double coo4x; 
    private double coo4y;

public Rectangulo(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){ this.establecer(x1,y1, x2,y2,x3,y3,x4,y4);
}

public void establecer(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){
    if (x1>0&&y1>0&&x2>0&&y2>0&&x3>0&&y3>0&&x4>0&&y4>0) { 
        if(x1<=20&&y1<=20&&x2<=20&&y2<=20&&x3<=20&&y3<=20&&x4<=20&&y4<=20){
        
            if(x1==x3&&x2==x4&&y1==y2&&y3==y4){ 
            coo1x = x1;
            coo1y = y1;
            coo2x = x2; 
            coo2y = y2;
            coo3x = x3; 
            coo3y = y3;
            coo4x = x4;
            coo4y = y4;
        }else if(x4==x3&&x2==x1&&y4==y2&&y3==y1){
            coo1x = x4; 
            coo1y = y4;
            coo2x = x2; 
            coo2y = y2;
            coo3x = x3; 
            coo3y = y3;
            coo4x = x1;
            coo4y = y1;
            }else if(x3==x2&&x4==x1&&y4==y3&&y2==y1){
            coo1x = x3; 
            coo1y = y3;
            coo2x = x2; 
            coo2y = y2;
            coo3x = x4; 
            coo3y = y4;
            coo4x = x1;
            coo4y = y1; 
            }
        }
    }
}
public double getLongitud(){
    double longitud=0; 
    if(coo2x>coo1x){
        longitud= coo2x-coo1x; 
        if(coo3y>coo1y){
            if(coo3y-coo1y>longitud){
                longitud=coo3y-coo1y;
        } 
    }else{
        if(coo1y-coo3y>longitud){ 
        longitud=coo1y-coo3y;
        } 
     }
    }else{
            longitud= coo1x-coo2x; 
            if(coo3y>coo1y){
                if(coo3y-coo1y>longitud){ 
                longitud=coo3y-coo1y;}       
            }else{
                if(coo1y-coo3y>longitud){ 
                    longitud=coo1y-coo3y;
                 }     
             }
         }
    return longitud; 
}
public double getAnchura(){
     double anchura=0; 
     if(coo2x>coo1x){
        anchura= coo2x-coo1x; 
        if(coo3y>coo1y){
            if(coo3y-coo1y<anchura){
                 anchura=coo3y-coo1y;
            }
         }else{ 
            if(coo1y-coo3y<anchura){
                anchura=coo1y-coo3y; }
     } }else{
        anchura= coo1x-coo2x; 
        if(coo3y>coo1y){
            if(coo3y-coo1y<anchura){ 
                anchura=coo3y-coo1y;
            } }else{
                if(coo1y-coo3y<anchura){ 
                    anchura=coo1y-coo3y;
                 }       
             }
        }
return anchura; 
}

public double getArea(){
    return this.getAnchura()*this.getLongitud();
}
public double getPerimetro(){
    return (2*this.getAnchura()) + (2*this.getLongitud());
}
public boolean noEsCuadrado(){ 
    if(getLongitud()!=getAnchura()){
        return true; 
    }else{
        return false; 
     }
    } 
}
