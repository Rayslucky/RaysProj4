package in.co.rays.project4.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import in.co.rays.project4.bean.BaseBean;
import in.co.rays.project4.bean.MarksheetBean;
import in.co.rays.project4.exception.ApplicationException;
import in.co.rays.project4.exception.DuplicateRecordException;
import in.co.rays.project4.model.MarksheetModel;
import in.co.rays.project4.model.StudentModel;
import in.co.rays.project4.util.DataUtility;
import in.co.rays.project4.util.DataValidator;
import in.co.rays.project4.util.PropertyReader;
import in.co.rays.project4.util.ServletUtility;

/**
 * Servlet implementation class MarksheetCtl
 *  * @author Laxman singh

 */
@ WebServlet(name="MarksheetCtl",urlPatterns={"/ctl/MarksheetCtl"})
public class MarksheetCtl extends BaseCtl {
	 private static Logger log = Logger.getLogger(MarksheetCtl.class);
	
		@Override
		protected void preload(HttpServletRequest request){
			StudentModel model=new StudentModel();
			try{
				List l=model.list();
				request.setAttribute("Studentlist", l);
				}catch(ApplicationException e){
					log.error(e);
				}
		}
		
	@Override
	protected boolean validate(HttpServletRequest request){
	    log.debug("MarksheetCtl Method validate Started");
	boolean pass = true;
	if(DataValidator.isNull(request.getParameter("rollNo"))){
		request.setAttribute("rollNo", PropertyReader.getValue("error.require", "RollNumber"));
		pass = false;
	}else if (!DataValidator.isRollNo(request.getParameter("rollNo"))) {
		request.setAttribute("rollNo" , "Enter the Valid Roll no.");

		pass = false ;
		 
	}	
	if(DataValidator.isNull(request.getParameter("physics"))){
		request.setAttribute("physics", PropertyReader.getValue("error.require", "Physics number"));
		pass = false;}
	
	if(DataValidator.isNotNull(request.getParameter("physics") )&& !DataValidator.isInteger(request.getParameter("physics")))
			{
		request.setAttribute("physics", PropertyReader.getValue("error.integer", "Marks"));
		pass = false;
			}
				
		if(DataUtility.getInt(request.getParameter("physics"))>100){
		request.setAttribute("physics", "Marks can not be greater than 100");
		pass = false;

		}
		 if (DataUtility.getInt(request.getParameter("physics")) < 0) {
	            request.setAttribute("physics", "Marks can not be less than 0");
	            pass = false;
	        
	}if(DataValidator.isNull(request.getParameter("chemistry"))){
		request.setAttribute("chemistry", PropertyReader.getValue("error.require", "chemistry number"));
		pass = false;

	}
	else if(DataValidator.isNotNull(request.getParameter("chemistry")) && !DataValidator.isInteger(request.getParameter("chemistry"))){
		request.setAttribute("chemistry", PropertyReader.getValue("error.integer", "Marks"));
		pass = false;

	}
	 if(DataUtility.getInt(request.getParameter("chemistry"))>100){
		request.setAttribute("chemistry", "Marks can not be greater than 100");
		pass = false;

	 }
		 if (DataUtility.getInt(request.getParameter("chemistry")) < 0) {
	            request.setAttribute("chemistry", "Marks can not be less than 0");
	            pass = false;

		 }
		 
	if(DataValidator.isNull(request.getParameter("maths"))){
		request.setAttribute("maths", PropertyReader.getValue("error.require", "maths number"));
		pass = false;
	} 
	else if(DataValidator.isNotNull(request.getParameter("maths")) && !DataValidator.isInteger(request.getParameter("maths"))){
		request.setAttribute("maths", PropertyReader.getValue("error.integer", "maths"));
		pass = false;

	} if(DataUtility.getInt(request.getParameter("maths"))>100){
		request.setAttribute("maths", "Marks can not greater than 100");
		pass = false;

	}
		 if (DataUtility.getInt(request.getParameter("maths")) < 0) {
	            request.setAttribute("maths", "Marks can not be less than 0");
	            pass = false;
	        }
		
	if(DataValidator.isNull(request.getParameter("StudentId"))){
		request.setAttribute("StudentId", PropertyReader.getValue("error.require", "StudentName"));
	}
	log.debug("MarksheetCtl Method validate Ended");
		return pass;
		
	}
	protected BaseBean populateBean(HttpServletRequest request){

	    log.debug("MarksheetCtl Method populatebean Started");
		MarksheetBean bean = new MarksheetBean();
		bean.setId(DataUtility.getInt(request.getParameter("id")));
		bean.setRollNo(DataUtility.getString(request.getParameter("rollNo")));
	//	bean.setName(DataUtility.getString(request.getParameter("name")));
		bean.setPhysics(DataUtility.getInt(request.getParameter("physics")));
		bean.setChemistry(DataUtility.getInt(request.getParameter("chemistry")));
		bean.setMaths(DataUtility.getInt(request.getParameter("maths")));
		
		System.out.println("Studentid>>>>>>>>>>>>>>>>>>>>>>"+request.getParameter("StudentId"));
		bean.setStudentid(DataUtility.getLong(request.getParameter("StudentId")));
		populateDTO(bean, request);
		System.out.println("Populate is done");
	    log.debug("MarksheetCtl Method populatebean Ended");

		return bean;
		}
	/**Contain display logics
*/
	protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException, ServletException{
	    log.debug("MarksheetCtl Method doGet Started");
	String op =DataUtility.getString(request.getParameter("operation"));
	MarksheetModel model =new MarksheetModel();
	int id =DataUtility.getInt(request.getParameter("id"));
	if(id>0){
		MarksheetBean bean ;
		try{
			bean=model.findByPK(id);
			ServletUtility.setBean(bean, request);
			
		}catch(ApplicationException e){
			log.error(e);
			ServletUtility.handleException(e, request, response);
			return;
		}
	}
	ServletUtility.forward(getView(), request, response);
	log.debug("MarksheetCtl Method doGet Ended");

	}
	/**Contain Submit Logic
	 */
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
	    log.debug("MarksheetCtl Method doPost Started");
	    System.out.println("465364566");
		String op=DataUtility.getString(request.getParameter("operation"));
		//getmodel
		MarksheetModel model =new MarksheetModel();
		int id=DataUtility.getInt(request.getParameter("id")); 
		if(OP_SAVE.equalsIgnoreCase(op) || OP_UPDATE.equalsIgnoreCase(op)){
			System.out.println("Inside save op");
			MarksheetBean bean=(MarksheetBean)populateBean(request);
			System.out.println("Inside populate bean");
			try{
				if(id>0){
					model.update(bean);
					ServletUtility.setBean(bean, request);
					ServletUtility.setSuccessMessage("Data is Succesfully Updated", request);
				}else{
					System.out.println("upper & model");
					long pk=model.add(bean);
					bean.setId(pk);
					ServletUtility.setBean(bean, request);
					ServletUtility.setSuccessMessage("Data is Succesfully Saved", request);
				}
				
			}catch(ApplicationException e){
				e.printStackTrace();
				log.error(e);
				ServletUtility.handleException(e, request, response);
				return;
			} catch (DuplicateRecordException e) {
				e.printStackTrace();
				ServletUtility.setBean(bean, request);
				ServletUtility.setErrorMessage("Rollno is already exist", request);
				
			}
		}else if(OP_DELETE.equalsIgnoreCase(op)){
			MarksheetBean bean =(MarksheetBean)populateBean(request);
			System.out.println("inside in try");
			try{
				model.delete(bean);
				ServletUtility.redirect(ORSView.MARKSHEET_LIST_CTL, request, response);
				System.out.println("In try block");
				return;
			}catch(ApplicationException e){
				System.out.println("In catch block");
				log.error(e);
				ServletUtility.handleException(e, request, response);
				return;
				}
			} else if (OP_CANCEL.equalsIgnoreCase(op)){
				ServletUtility.redirect(ORSView.MARKSHEET_LIST_CTL, request, response);
				return;
		}
	//	ServletUtility.setBean(bean, request);
		ServletUtility.forward(getView(), request, response);
	log.debug("MarksheetCtl Method doPost Ended");
	}

		@Override
		protected String getView() {
			// TODO Auto-generated method stub
			return ORSView.MARKSHEET_VIEW;
		}
}