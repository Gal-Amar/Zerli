package communication;

import java.io.Serializable;

/** Represents an enumeration of messages that can be sent by the Server to Client.
 *
 */
public enum MessageFromServer implements Serializable {

    /* Client * UserController */
    LOGIN_SUCCESS,
    LOGIN_FAIL,
    LOGOUT_SUCCESS,
    LOGOUT_FAIL,
    ALREADY_LOGGED_IN,
    CUSTOMER_IS_BLOCKED,
    CUSTOMER_CREATE_NEW,
    CUSTOMER_FREEZE,
    EMPLOYEE_PERMISSION_CHANGE,
    USER_INFORMATION_GET_FAIL,
    USER_INFORMATION_GET_SUCCESS,

    /* OrderController */
    ORDERS_GET_FAIL,
    ORDERS_GET_SUCCESS,
    ORDER_PRODUCTS_GET_SUCCESS,
    ORDER_BRANCHES_GET_FAIL,
    ORDER_BRANCHES_GET_SUCCESS,
    ORDER_CREATE_NEW_SUCCESS,
    ORDER_CREATE_NEW_FAIL,
    ORDER_GET_BALANCE_FAIL,
    ORDER_GET_BALANCE_SUCCESS,
    ORDER_CANCEL_TIME_FAIL,
    ORDER_CANCEL_TIME_SUCCESS,
    ORDER_STATUS_SUCCESS,
    ORDER_STATUS_FAIL,
    ORDER_GET_BRANCH_FAIL,
    ORDER_GET_BRANCH_SUCCESS,

    /* ItemController */
    ITEM_ADD_SUCCESS,
    ITEM_ADD_FAIL,
    ITEMS_GET_SUCCESS,
    ITEMS_GET_FAIL,
    ITEM_UPDATE_SUCCESS,
    ITEM_UPDATE_FAIL,
    ITEM_DELETE_SUCCESS,
    ITEM_DELETE_FAIL,

    /* ProductController */
    PRODUCT_ADD_SUCCESS,
    PRODUCT_ADD_FAIL,
    PRODUCTS_GET_SUCCESS,
    PRODUCTS_GET_FAIL,
    PRODUCT_UPDATE_SUCCESS,
    PRODUCT_UPDATE_FAIL,
    PRODUCT_GET_ITEMS_FAIL,
    PRODUCT_GET_ITEMS_SUCCEED,

    /* CatalogController */
    CATALOG_GET_PRODUCT_ITEMS_SUCCESS,
    CATALOG_GET_PRODUCT_ITEMS_FAIL,

    /* SurveyController */
    SURVEY_UNAUTHORIZED_CUSTOMER,
    SURVEY_INSERT_FAIL,
    SURVEY_INSERT_SUCCESS,
    SURVEY_NAMES_SUCCESS,
    SURVEY_NAMES_FAIL,
    SURVEY_ANSWERS_SUCCESS,
    SURVEY_ANSWERS_FAIL,
    SURVEY_UPLOAD_SUMMARY_SUCCESS,
    SURVEY_UPLOAD_SUMMARY_FAIL,
    SURVEY_ID_GET_SUCCESS,
    SURVEY_IDS_REQUEST_SUCCESS,
    SURVEY_IDS_REQUEST_FAIL,
    SURVEY_IDS_CUSTOMER_SUCCESS,
    SURVEY_ALREADY_FILLED,

    /* ComplaintController */
    COMPLAINT_RESPONSE,
    COMPLAINT_VALIDATE_RESPONSE,
    COMPLAINTS_GET_SUCCESS,
    COMPLAINT_CLOSE_SUCCESS,

    /* ReportController */
    REPORT_VIEW_SUCCESS,
    REPORT_VIEW_FAIL,
    REPORT_LAST_GET_FAIL,
    REPORT_LAST_GET_SUCCESS,
    MANAGER_BRANCH_GET_SUCCESS,

    /* DeliveryController */
    DELIVERIES_GET_FAIL,
    DELIVERIES_GET_SUCCESS,
    DELIVERY_UPDATE_FAIL,
    DELIVERY_UPDATE_SUCCESS,
    DELIVERY_ORDER_REFUND_FAIL,
    DELIVERY_ORDER_REFUND_SUCCESS,
    ORDERS_GET_BY_BRANCH_FAIL,
    ORDERS_GET_BY_BRANCH_SUCCESS,
    CUSTOMER_GET_EMAIL_SUCCESS,
    CUSTOMER_GET_EMAIL_FAIL,
    CATALOG_PRODUCTS_GET_SUCCESS,
    CATALOG_PRODUCTS_GET_FAIL, GET_USER_PERMISSION_SUCCEED, GET_USER_PERMISSION_NOT_SUCCEED, SURVEY_ID_GET_FAIL,

}
