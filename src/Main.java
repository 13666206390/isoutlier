import outliner.datanode;
import outliner.detect;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.####");

        ArrayList<datanode> dpoints = new ArrayList<datanode>();

        double[] a = { 2, 3 };
        double[] b = { 2, 4 };
        double[] c = { 1, 4 };
        double[] d = { 1, 3 };
        double[] e = { 2, 2 };
        double[] f = { 3, 2 };

        double[] g = { 8, 7 };
        double[] h = { 8, 6 };
        double[] i = { 7, 7 };
        double[] j = { 7, 6 };
        double[] k = { 8, 5 };

        double[] l = { 100, 2 };// 孤立点

        double[] m = { 8, 20 };
        double[] n = { 8, 19 };
        double[] o = { 7, 18 };
        double[] p = { 7, 17 };
        double[] q = { 8, 21 };

        dpoints.add(new datanode("a", a));
        dpoints.add(new datanode("b", b));
        dpoints.add(new datanode("c", c));
        dpoints.add(new datanode("d", d));
        dpoints.add(new datanode("e", e));
        dpoints.add(new datanode("f", f));

        dpoints.add(new datanode("g", g));
        dpoints.add(new datanode("h", h));
        dpoints.add(new datanode("i", i));
        dpoints.add(new datanode("j", j));
        dpoints.add(new datanode("k", k));

        dpoints.add(new datanode("l", l));

        dpoints.add(new datanode("m", m));
        dpoints.add(new datanode("n", n));
        dpoints.add(new datanode("o", o));
        dpoints.add(new datanode("p", p));
        dpoints.add(new datanode("q", q));

        detect lof = new detect();

        List<datanode> nodeList = lof.getOutlierNode(dpoints);

        for (datanode node : nodeList) {
            System.out.println(node.getNodeName() + "  " + df.format(node.getLof()));
        }
    }
}
