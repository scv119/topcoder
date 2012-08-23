import java.util.*;

public class RotatingBot {
	public int minArea(int[] moves) {
		int maxX =0;
        int minX =0;
        int maxY =0;
        int minY =0;

        int x = 0;
        int y = 0;

        for(int i = 0 ; i < moves.length ; i ++ ){
            int m = moves[i];
            if(i%4==0)
                x+=m;
            else if(i%4 == 1)
                y += m;
            else if(i%4 == 2)
                x -= m;
            else
                y -= m;
            if(x > maxX)
                maxX = x;
            if(x < minX)
                minX = x;
            if(y > maxY)
                maxY = y;
            if(y < minY)
                minY = y;
        }

        int area = (maxX - minX + 1) * (maxY - minY + 1);

        x = 0;
        y = 0;

        List<Line> list = new ArrayList<Line>();
        for(int i = 0 ; i < moves.length ; i ++){
            int m = moves[i];
            Line line;
            if(i%4==0){
                x += m;
                line = (new Line(x-m+1,y,x,y));
            }
            else if(i%4 == 1){
                y += m;
                line =(new Line(x,y-m+1,x,y));

            }
            else if(i%4 == 2){
                x -= m;
                line =(new Line(x,y,x+m-1,y));
            }
            else{
                y -= m;
                line =(new Line(x,y,x,y+m-1));
            }
            if(i == 0)
                line.x1--;
            list.add(line);
            for(int j = 0 ; j < list.size() -1 ; j ++){
                if(inter(list.get(j), list.get(list.size()-1)))
                    return -1;
            }
        }
        return area;

	}

    class Line{
        int x1;
        int y1;

        int x2;
        int y2;

        public Line(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    boolean inter(Line line1, Line line2){
        int x1 = Math.max(line1.x1, line2.x1);
        int y1 = Math.max(line1.y1, line2.y1);

        int x2 = Math.min(line1.x2, line2.x2);
        int y2 = Math.min(line1.y2, line2.y2);

        if(x1 <= x2 && y1 <= y2)
            return true;
        return false;
    }
}
