//package Servlets;
//
//import Model.Result;;
//import Model.ResultsBean;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.util.Date;
//
//
//@WebServlet("/area_check")
//public class AreaCheckServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doPost(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        try {
//            double x = Utils.getDoubleParameter(req.getParameter("x"));
//            double y = Utils.getDoubleParameter(req.getParameter("y"));
//            double r = Utils.getDoubleParameter(req.getParameter("r"));
//            if (!Utils.checkDataValidation(x, y, r)) {
//                throw new Exception();
//            }
//            HttpSession session = req.getSession();
//            session.getAttribute("resultsBean");
//            Result entry = new Result(x, y, r);
//            ResultsBean results = (ResultsBean) session.getAttribute("results");
//            if (results == null) results = new ResultsBean();
//            results.addFromSvg();
//            session.setAttribute("results", results);
//        } catch (Exception e) {
//            e.printStackTrace();
//            resp.sendError(400);
//            resp.setStatus(400);
//        }
//    }
//
//}