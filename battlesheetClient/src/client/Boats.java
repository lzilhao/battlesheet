/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author ee12150
 */
public class Boats {
    int[][] board = new int[10][10];    
    
    public int[][] isPlaceValid(int tipoBarco, int orient, int[] center) {
/*
tipobarco: 	1-4 sao submarinos de tamanho 1
			5-7 sao destroyers de tamanho 2
			8-9 sao cruisers de tamanho 3
			10 e um battlehsip de tamanho 4
*/		
        int invFlag = 0;
        int[][] invCoord = new int[4][2];
        int[][] coord = new int[4][2]; // [#quadrado][x][y]
        for(int i = 0; i<4; i++) {
            for(int j=0; j<2; j++) {
                coord[i][j] = -1;
            }
        }
        center[0] = center[0]-1;
        center[1] = center[1]-1;
        try {
            if (tipoBarco == 1 || tipoBarco == 2 || tipoBarco == 3 || tipoBarco == 4) {
                if (board[center[0]][center[1]] == 0) {
                    coord[0][0] = center[0];
                    coord[0][1] = center[1];

                   	invFlag = 0;
                    //board[center[0]][center[1]] = tipoBarco;
                }
                else if (board[center[0]][center[1]] > 0 || board[center[0]][center[1]]==-99) {
                    invCoord[0][0] = -center[0]-1;
                    invCoord[0][1] = -center[1]-1;
                    invFlag = 1;
                }
            }
            else if (tipoBarco == 5 || tipoBarco == 6) {
                if (orient == 0 || orient == 2) {
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]+1][center[1]] == 0)){
                        coord[0][0] = center[0];
                        coord[0][1] = center[1];
                        coord[1][0] = center[0]+1;
                        coord[1][1] = center[1];

                        invFlag = 0;
                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        */
                    }
                    else if ((board[center[0]][center[1]] > 0) || (board[center[0]][center[1]]==-99) || (board[center[0]+1][center[1]] > 0) || (board[center[0]+1][center[1]]==-99)){
                        invCoord[0][0] = -center[0]-1;
                        invCoord[0][1] = -center[1]-1;
                        invCoord[1][0] = -(center[0]+1)-1;
                        invCoord[1][1] = -(center[1])-1;
                        
                        invFlag = 1;
                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        */
                    }
                }
                else if(orient == 1 || orient == 3) {
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]][center[1]+1] == 0)){
                        coord[0][0] = center[0];
                        coord[0][1] = center[1];
                        coord[1][0] = center[0];
                        coord[1][1] = center[1]+1;

                        invFlag = 0;

                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        */
                    }
                    else if ((board[center[0]][center[1]] > 0) || (board[center[0]][center[1]]==-99) || (board[center[0]][center[1]+1] > 0) || (board[center[0]][center[1]+1]==-99)){
                        invCoord[0][0] = -center[0]-1;
                        invCoord[0][1] = -center[1]-1;
                        invCoord[1][0] = -center[0]-1;
                        invCoord[1][1] = -(center[1]+1)-1;
                        
                        invFlag = 1;

                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        */
                    }
                }
            }
            else if (tipoBarco == 7 || tipoBarco == 8) {
                if (orient == 0 || orient == 2) {
                    System.out.print(center[0] + " " + center[1] + "\n");
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]+1][center[1]] == 0) && (board[center[0]-1][center[1]] == 0) ){
                        coord[0][0] = center[0];
                        coord[0][1] = center[1];
                        coord[1][0] = center[0]+1;
                        coord[1][1] = center[1];
                        coord[2][0] = center[0]-1;
                        coord[2][1] = center[1];

                        invFlag = 0;

                        /*board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        */
                    }
                    else if ((board[center[0]][center[1]] > 0) || (board[center[0]][center[1]]==-99) || (board[center[0]+1][center[1]] > 0) || (board[center[0]+1][center[1]]==-99) || (board[center[0]-1][center[1]] > 0)  || (board[center[0]-1][center[1]]==-99)){
                        invCoord[0][0] = -center[0]-1;
                        invCoord[0][1] = -center[1]-1;
                        invCoord[1][0] = -(center[0]+1)-1;
                        invCoord[1][1] = -center[1]-1;
                        invCoord[2][0] = -(center[0]-1)-1;
                        invCoord[2][1] = -center[1]-1;
                        
                        invFlag = 1;

                        /*board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        */
                    }
                }
                else if(orient == 1 || orient == 3) {
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]][center[1]+1] == 0) && (board[center[0]][center[1]-1] == 0) ){
                        coord[0][0] = center[0];
                        coord[0][1] = center[1];
                        coord[1][0] = center[0];
                        coord[1][1] = center[1]+1;
                        coord[2][0] = center[0];
                        coord[2][1] = center[1]-1;

                        invFlag = 0;

                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        */
                    }
                    else if ((board[center[0]][center[1]] > 0) || (board[center[0]][center[1]]==-99) ||  (board[center[0]][center[1]+1] > 0) || (board[center[0]][center[1]+1]==-99) || (board[center[0]][center[1]-1] > 0) || (board[center[0]][center[1]-1]==-99) ){
                        invCoord[0][0] = -center[0]-1;
                        invCoord[0][1] = -center[1]-1;
                        invCoord[1][0] = -center[0]-1;
                        invCoord[1][1] = -(center[1]+1)-1;
                        invCoord[2][0] = -center[0]-1;
                        invCoord[2][1] = -(center[1]-1)-1;

                        invFlag = 1;

                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        */
                    }
                }
            }
            else if (tipoBarco == 9) {
                if (orient == 0) {
                	if ((board[center[0]][center[1]] == 0) && (board[center[0]+1][center[1]] == 0) && (board[center[0]-1][center[1]] == 0) && (board[center[0]][center[1]+1] == 0)){
                        coord[0][0] = center[0];
                        coord[0][1] = center[1];
                        coord[1][0] = center[0]+1;
                        coord[1][1] = center[1];
                        coord[2][0] = center[0]-1;
                        coord[2][1] = center[1];
                        coord[3][0] = center[0];
                        coord[3][1] = center[1]+1;

                        invFlag = 0;

                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        */
                    }
                    else if ((board[center[0]][center[1]] > 0) || (board[center[0]][center[1]]==-99) || (board[center[0]+1][center[1]] > 0)  || (board[center[0]+1][center[1]]==-99) || (board[center[0]-1][center[1]] > 0) || (board[center[0]-1][center[1]]==-99) || (board[center[0]][center[1]+1] > 0) || (board[center[0]][center[1]+1]==-99)){
                        invCoord[0][0] = -center[0]-1;
                        invCoord[0][1] = -center[1]-1;
                        invCoord[1][0] = -(center[0]+1)-1;
                        invCoord[1][1] = -center[1]-1;
                        invCoord[2][0] = -(center[0]-1)-1;
                        invCoord[2][1] = -center[1]-1;
                        invCoord[3][0] = -center[0]-1;
                        invCoord[3][1] = -(center[1]+1)-1;

                        invFlag = 1;
                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        */
                    }
                    
                }
                if (orient == 1) { 
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]][center[1]+1] == 0) && (board[center[0]][center[1]-1] == 0) && (board[center[0]+1][center[1]] == 0) ){
                        coord[0][0] = center[0];
                        coord[0][1] = center[1];
                        coord[1][0] = center[0];
                        coord[1][1] = center[1]+1;
                        coord[2][0] = center[0];
                        coord[2][1] = center[1]-1;
                        coord[3][0] = center[0]+1;
                        coord[3][1] = center[1];

                        invFlag = 0;

                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        */
                    }
                    else if ((board[center[0]][center[1]] > 0) || (board[center[0]][center[1]]==-99) || (board[center[0]][center[1]+1] > 0) || (board[center[0]][center[1]+1]==-99) || (board[center[0]][center[1]-1] > 0) || (board[center[0]][center[1]-1]==-99) || (board[center[0]+1][center[1]] > 0)  || (board[center[0]+1][center[1]]==-99)){
                        invCoord[0][0] = -center[0]-1;
                        invCoord[0][1] = -center[1]-1;
                        invCoord[1][0] = -center[0]-1;
                        invCoord[1][1] = -(center[1]+1)-1;
                        invCoord[2][0] = -center[0]-1;
                        invCoord[2][1] = -(center[1]-1)-1;
                        invCoord[3][0] = -(center[0]+1)-1;
                        invCoord[3][1] = -center[1]-1;

                        invFlag = 1;
                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        */
                    }
                }
                if (orient == 2) {
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]+1][center[1]] == 0) && (board[center[0]-1][center[1]] == 0) && (board[center[0]][center[1]-1] == 0) ){
                        coord[0][0] = center[0];
                        coord[0][1] = center[1];
                        coord[1][0] = center[0]+1;
                        coord[1][1] = center[1];
                        coord[2][0] = center[0]-1;
                        coord[2][1] = center[1];
                        coord[3][0] = center[0];
                        coord[3][1] = center[1]-1;

                        invFlag = 0;

                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        */
                    }
                    else if ((board[center[0]][center[1]] > 0) || (board[center[0]][center[1]]==-99) || (board[center[0]+1][center[1]] > 0)  || (board[center[0]+1][center[1]]==-99) || (board[center[0]-1][center[1]] > 0)  || (board[center[0]-1][center[1]]==-99) || (board[center[0]][center[1]-1] > 0)  || (board[center[0]][center[1]-1]==-99) ){
                        invCoord[0][0] = -center[0]-1;
                        invCoord[0][1] = -center[1]-1;
                        invCoord[1][0] = -(center[0]+1)-1;
                        invCoord[1][1] = -center[1]-1;
                        invCoord[2][0] = -(center[0]-1)-1;
                        invCoord[2][1] = -center[1]-1;
                        invCoord[3][0] = -center[0]-1;
                        invCoord[3][1] = -(center[1]-1)-1;

                        invFlag = 1;

                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        */
                    }
                }
                if (orient == 3) { 
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]][center[1]+1] == 0) && (board[center[0]][center[1]-1] == 0) && (board[center[0]-1][center[1]] == 0) ){
                        coord[0][0] = center[0];
                        coord[0][1] = center[1];
                        coord[1][0] = center[0];
                        coord[1][1] = center[1]+1;
                        coord[2][0] = center[0];
                        coord[2][1] = center[1]-1;
                        coord[3][0] = center[0]-1;
                        coord[3][1] = center[1];

                        invFlag = 0;

                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        */
                    }
                    else if ((board[center[0]][center[1]] > 0) || (board[center[0]][center[1]]==-99) || (board[center[0]][center[1]+1] > 0)  || (board[center[0]][center[1]+1]==-99) || (board[center[0]][center[1]-1] > 0)  || (board[center[0]][center[1]-1]==-99) || (board[center[0]-1][center[1]] > 0)  || (board[center[0]-1][center[1]]==-99) ){
                        invCoord[0][0] = -center[0]-1;
                        invCoord[0][1] = -center[1]-1;
                        invCoord[1][0] = -center[0]-1;
                        invCoord[1][1] = -(center[1]+1)-1;
                        invCoord[2][0] = -center[0]-1;
                        invCoord[2][1] = -(center[1]-1)-1;
                        invCoord[3][0] = -(center[0]-1)-1;
                        invCoord[3][1] = -center[1]-1;

                        invFlag = 1;

                        /*
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        */
                    }
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("OUT OF BOUNDS");
        }
        finally{
        	center[0] = center[0]+1;
        	center[1] = center[1]+1;
            System.out.print("\n");
            for(int i = 0; i<4; i++) {
                for(int j=0; j<2; j++) {
                    coord[i][j] = coord[i][j]+1;
                    System.out.print(coord[i][j]+" ");
                }
                System.out.print("\n");
            }
            System.out.print("inv\n");
            for(int i = 0; i<4; i++) {
                for(int j=0; j<2; j++) {
                    System.out.print(invCoord[i][j]+" ");
                }
                System.out.print("\n");
            }
            if (invFlag == 0) {
				return coord;
            }
            else if( invFlag == 1) {
            	return invCoord;
            }
            return null;
        }
    }
    
    
    public Boolean addBoats(int tipoBarco, int orient, int[] center) {
        Boolean flagWrote=true;
        center[0] = center[0]-1;
        center[1] = center[1]-1;
        //o valor 99 corresponde a um perimetro a volta do barco que nao pode ser ocupado
        try {
            if (tipoBarco == 1 || tipoBarco == 2 || tipoBarco == 3 || tipoBarco == 4) {
                if (board[center[0]][center[1]] == 0) {
                    board[center[0]][center[1]] = tipoBarco;
                    flagWrote=true;
                }
                else{
                    flagWrote=false;
                }
            }
            else if (tipoBarco == 5 || tipoBarco == 6) {
                if (orient == 0 || orient == 2) {
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]+1][center[1]] == 0)){                        
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;  
                        flagWrote=true;
                    }
                    else{
                        flagWrote=false;
                    }
                }
                else if(orient == 1 || orient == 3) {
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]][center[1]+1] == 0)){                        
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco; 
                        flagWrote=true;
                    }
                    else{
                        flagWrote=false;
                    }
                }
            }
            else if (tipoBarco == 7 || tipoBarco == 8) {
                if (orient == 0 || orient == 2) {
                    System.out.print(center[0] + " " + center[1] + "\n");
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]+1][center[1]] == 0) && (board[center[0]-1][center[1]] == 0) ){     

                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        flagWrote=true;                        
                    }
                    else{
                        flagWrote=false;
                    }
                }
                else if(orient == 1 || orient == 3) {
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]][center[1]+1] == 0) && (board[center[0]][center[1]-1] == 0) ){
                  
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        flagWrote=true;
                        
                    }
                    else{
                        flagWrote=false;
                    }
                }
            }

            else if (tipoBarco == 9) {
                if (orient == 0) {
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]+1][center[1]] == 0) && (board[center[0]-1][center[1]] == 0) && (board[center[0]][center[1]+1] == 0)){
                       
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        flagWrote=true;
                        
                    }
                    else{
                        flagWrote=false;
                    }
                }
                if (orient == 1) { 
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]][center[1]+1] == 0) && (board[center[0]][center[1]-1] == 0) && (board[center[0]+1][center[1]] == 0) ){
           
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        flagWrote=true;                        
                    }
                    else{
                        flagWrote=false;
                    }
                }
                if (orient == 2) {
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]+1][center[1]] == 0) && (board[center[0]-1][center[1]] == 0) && (board[center[0]][center[1]-1] == 0) ){
            
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]+1][center[1]] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco; 
                        flagWrote=true;
                    }
                    else{
                        flagWrote=false;
                    }
                }
                if (orient == 3) { 
                    if ((board[center[0]][center[1]] == 0) && (board[center[0]][center[1]+1] == 0) && (board[center[0]][center[1]-1] == 0) && (board[center[0]-1][center[1]] == 0) ){
              
                        board[center[0]][center[1]] = tipoBarco;
                        board[center[0]][center[1]+1] = tipoBarco;
                        board[center[0]][center[1]-1] = tipoBarco;
                        board[center[0]-1][center[1]] = tipoBarco;
                        flagWrote=true;
                    }
                    else{
                        flagWrote=false;
                    }
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("OUT OF BOUNDS");
            flagWrote=false;
        }
        finally {
        	center[0] = center[0]+1;
        	center[1] = center[1]+1;
                System.out.println("\nCenter "+center[0] + " " + center[1]);
                System.out.println("tipoBarco - " + tipoBarco);
                System.out.println("orient - " + orient);
                //////////////////////////// perimeter
                
                for(int i=0; i<10; i++) {
    			for(int j=0; j<10; j++){
    				if(i==0 && j==0) { //canto superior esquerdo
    					if((board[i][j]==0) && (board[i][j+1]>0 || board[i+1][j]>0 || board[i+1][j+1]>0)){
    						board[i][j]=-99;
    					}
    				}
    				else if(i==0 && j<9){	//margem superior
    					if((board[i][j]==0) && (board[i][j+1]>0 || board[i+1][j+1]>0 || board[i+1][j]>0 || board[i+1][j-1]>0 || board[i][j-1]>0)){
    						board[i][j]=-99;
    					}
    				}
    				else if(i==0 && j==9){ //canto superior direito
    					if((board[i][j]==0) && (board[i+1][j]>0 || board[i+1][j-1]>0 || board[i][j-1]>0)){
    						board[i][j]=-99;
    					}
    				}
    				else if(j==0 && i<9){ //margem esquerda
    					if((board[i][j]==0) && (board[i][j+1]>0 || board[i+1][j+1]>0 || board[i+1][j]>0 || board[i-1][j]>0 || board[i-1][j+1]>0)){
						board[i][j]=-99;
    					}
    				}
    				else if(j==9 && i<9){ //margem direita
    					if((board[i][j]==0) && (board[i+1][j]>0 || board[i+1][j-1]>0 || board[i][j-1]>0 || board[i-1][j-1]>0 || board[i-1][j]>0)){
    						board[i][j]=-99;
    					}
    				}
    				else if(i==9 && j==0){ //canto inferior esquerdo
    					if((board[i][j]==0) && (board[i][j+1]>0 || board[i-1][j]>0 || board[i-1][j+1]>0)){
						board[i][j]=-99;
    					}
    				}
    				else if(i==9 && j<9){ //margem inferior
    					if((board[i][j]==0) && (board[i][j+1]>0 || board[i][j-1]>0 || board[i-1][j-1]>0 || board[i-1][j]>0 || board[i-1][j+1]>0)){
						board[i][j]=-99;
    					}
    				}
    				else if(i==9 && j==9){
    					if((board[i][j]==0) && (board[i][j-1]>0 || board[i-1][j-1]>0 || board[i-1][j]>0)){
    						board[i][j]=-99;
    					}
    				}
    				//caso geral no meio do tabuleiro
    				else if((board[i][j]==0) && (board[i][j+1]>0 || board[i+1][j+1]>0 || board[i+1][j]>0 || board[i+1][j-1]>0 || board[i][j-1]>0 || board[i-1][j-1]>0 || board[i-1][j]>0 || board[i-1][j+1]>0)){
						board[i][j]=-99;
    				}
    			}
    		}
                
                ////////////////////
                for(int i=0; i<10; i++){
                   for(int j=0; j<10; j++){
                       System.out.print(board[i][j]+"\t");
                   }
                   System.out.println();
                }
                return flagWrote;
        }        
    }

    public void removeBoat(int tipoBarco) {
    	for(int i=0; i<10; i++) {
    		for(int j=0; j<10; j++) {
    			if(board[i][j] == tipoBarco) {
    				board[i][j] = 0;
    			}
    		}
    	}
    }
    public void resetBoard() {
    	for(int i=0; i<10; i++) {
    		for(int j=0; j<10; j++) {
                    board[i][j] = 0;    
    		}
    	}
    }
}