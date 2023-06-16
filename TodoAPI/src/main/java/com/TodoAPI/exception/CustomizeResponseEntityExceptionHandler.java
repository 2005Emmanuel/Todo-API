/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TodoAPI.exception;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author user
 */
@ControllerAdvice
public class CustomizeResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     *
     * @param ex
     * @param request
     * @return
     * @throws Exception
     */
 
    @ExceptionHandler(Exception.class)
      public final ResponseEntity<ExceptionResponse> handleExceptions(Exception ex, WebRequest request) throws Exception {
          ExceptionResponse response = new ExceptionResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),new Date(), ex.getMessage(), request.getDescription(false));
          return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: instanceof    #27                 // class org/springframework/web/HttpRequestMethodNotSupportedException
         * 4: ifeq          27
         * 7: aload_1
         * 8: checkcast     #27                 // class org/springframework/web/HttpRequestMethodNotSupportedException
         * 11: astore_3
         * 12: aload_0
         * 13: aload_3
         * 14: aload_3
         * 15: invokevirtual #29                 // Method org/springframework/web/HttpRequestMethodNotSupportedException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 18: aload_3
         * 19: invokevirtual #33                 // Method org/springframework/web/HttpRequestMethodNotSupportedException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 22: aload_2
         * 23: invokevirtual #37                 // Method handleHttpRequestMethodNotSupported:(Lorg/springframework/web/HttpRequestMethodNotSupportedException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 26: areturn
         * 27: aload_1
         * 28: instanceof    #41                 // class org/springframework/web/HttpMediaTypeNotSupportedException
         * 31: ifeq          58
         * 34: aload_1
         * 35: checkcast     #41                 // class org/springframework/web/HttpMediaTypeNotSupportedException
         * 38: astore        4
         * 40: aload_0
         * 41: aload         4
         * 43: aload         4
         * 45: invokevirtual #43                 // Method org/springframework/web/HttpMediaTypeNotSupportedException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 48: aload         4
         * 50: invokevirtual #44                 // Method org/springframework/web/HttpMediaTypeNotSupportedException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 53: aload_2
         * 54: invokevirtual #45                 // Method handleHttpMediaTypeNotSupported:(Lorg/springframework/web/HttpMediaTypeNotSupportedException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 57: areturn
         * 58: aload_1
         * 59: instanceof    #49                 // class org/springframework/web/HttpMediaTypeNotAcceptableException
         * 62: ifeq          89
         * 65: aload_1
         * 66: checkcast     #49                 // class org/springframework/web/HttpMediaTypeNotAcceptableException
         * 69: astore        5
         * 71: aload_0
         * 72: aload         5
         * 74: aload         5
         * 76: invokevirtual #51                 // Method org/springframework/web/HttpMediaTypeNotAcceptableException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 79: aload         5
         * 81: invokevirtual #52                 // Method org/springframework/web/HttpMediaTypeNotAcceptableException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 84: aload_2
         * 85: invokevirtual #53                 // Method handleHttpMediaTypeNotAcceptable:(Lorg/springframework/web/HttpMediaTypeNotAcceptableException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 88: areturn
         * 89: aload_1
         * 90: instanceof    #57                 // class org/springframework/web/bind/MissingPathVariableException
         * 93: ifeq          120
         * 96: aload_1
         * 97: checkcast     #57                 // class org/springframework/web/bind/MissingPathVariableException
         * 100: astore        6
         * 102: aload_0
         * 103: aload         6
         * 105: aload         6
         * 107: invokevirtual #59                 // Method org/springframework/web/bind/MissingPathVariableException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 110: aload         6
         * 112: invokevirtual #60                 // Method org/springframework/web/bind/MissingPathVariableException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 115: aload_2
         * 116: invokevirtual #61                 // Method handleMissingPathVariable:(Lorg/springframework/web/bind/MissingPathVariableException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 119: areturn
         * 120: aload_1
         * 121: instanceof    #65                 // class org/springframework/web/bind/MissingServletRequestParameterException
         * 124: ifeq          151
         * 127: aload_1
         * 128: checkcast     #65                 // class org/springframework/web/bind/MissingServletRequestParameterException
         * 131: astore        7
         * 133: aload_0
         * 134: aload         7
         * 136: aload         7
         * 138: invokevirtual #67                 // Method org/springframework/web/bind/MissingServletRequestParameterException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 141: aload         7
         * 143: invokevirtual #68                 // Method org/springframework/web/bind/MissingServletRequestParameterException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 146: aload_2
         * 147: invokevirtual #69                 // Method handleMissingServletRequestParameter:(Lorg/springframework/web/bind/MissingServletRequestParameterException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 150: areturn
         * 151: aload_1
         * 152: instanceof    #73                 // class org/springframework/web/multipart/support/MissingServletRequestPartException
         * 155: ifeq          182
         * 158: aload_1
         * 159: checkcast     #73                 // class org/springframework/web/multipart/support/MissingServletRequestPartException
         * 162: astore        8
         * 164: aload_0
         * 165: aload         8
         * 167: aload         8
         * 169: invokevirtual #75                 // Method org/springframework/web/multipart/support/MissingServletRequestPartException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 172: aload         8
         * 174: invokevirtual #76                 // Method org/springframework/web/multipart/support/MissingServletRequestPartException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 177: aload_2
         * 178: invokevirtual #77                 // Method handleMissingServletRequestPart:(Lorg/springframework/web/multipart/support/MissingServletRequestPartException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 181: areturn
         * 182: aload_1
         * 183: instanceof    #81                 // class org/springframework/web/bind/ServletRequestBindingException
         * 186: ifeq          213
         * 189: aload_1
         * 190: checkcast     #81                 // class org/springframework/web/bind/ServletRequestBindingException
         * 193: astore        9
         * 195: aload_0
         * 196: aload         9
         * 198: aload         9
         * 200: invokevirtual #83                 // Method org/springframework/web/bind/ServletRequestBindingException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 203: aload         9
         * 205: invokevirtual #84                 // Method org/springframework/web/bind/ServletRequestBindingException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 208: aload_2
         * 209: invokevirtual #85                 // Method handleServletRequestBindingException:(Lorg/springframework/web/bind/ServletRequestBindingException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 212: areturn
         * 213: aload_1
         * 214: instanceof    #89                 // class org/springframework/web/bind/MethodArgumentNotValidException
         * 217: ifeq          244
         * 220: aload_1
         * 221: checkcast     #89                 // class org/springframework/web/bind/MethodArgumentNotValidException
         * 224: astore        10
         * 226: aload_0
         * 227: aload         10
         * 229: aload         10
         * 231: invokevirtual #91                 // Method org/springframework/web/bind/MethodArgumentNotValidException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 234: aload         10
         * 236: invokevirtual #92                 // Method org/springframework/web/bind/MethodArgumentNotValidException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 239: aload_2
         * 240: invokevirtual #93                 // Method handleMethodArgumentNotValid:(Lorg/springframework/web/bind/MethodArgumentNotValidException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 243: areturn
         * 244: aload_1
         * 245: instanceof    #97                 // class org/springframework/web/servlet/NoHandlerFoundException
         * 248: ifeq          275
         * 251: aload_1
         * 252: checkcast     #97                 // class org/springframework/web/servlet/NoHandlerFoundException
         * 255: astore        11
         * 257: aload_0
         * 258: aload         11
         * 260: aload         11
         * 262: invokevirtual #99                 // Method org/springframework/web/servlet/NoHandlerFoundException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 265: aload         11
         * 267: invokevirtual #100                // Method org/springframework/web/servlet/NoHandlerFoundException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 270: aload_2
         * 271: invokevirtual #101                // Method handleNoHandlerFoundException:(Lorg/springframework/web/servlet/NoHandlerFoundException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 274: areturn
         * 275: aload_1
         * 276: instanceof    #105                // class org/springframework/web/context/request/async/AsyncRequestTimeoutException
         * 279: ifeq          306
         * 282: aload_1
         * 283: checkcast     #105                // class org/springframework/web/context/request/async/AsyncRequestTimeoutException
         * 286: astore        12
         * 288: aload_0
         * 289: aload         12
         * 291: aload         12
         * 293: invokevirtual #107                // Method org/springframework/web/context/request/async/AsyncRequestTimeoutException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 296: aload         12
         * 298: invokevirtual #108                // Method org/springframework/web/context/request/async/AsyncRequestTimeoutException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 301: aload_2
         * 302: invokevirtual #109                // Method handleAsyncRequestTimeoutException:(Lorg/springframework/web/context/request/async/AsyncRequestTimeoutException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 305: areturn
         * 306: aload_1
         * 307: instanceof    #113                // class org/springframework/web/ErrorResponseException
         * 310: ifeq          337
         * 313: aload_1
         * 314: checkcast     #113                // class org/springframework/web/ErrorResponseException
         * 317: astore        13
         * 319: aload_0
         * 320: aload         13
         * 322: aload         13
         * 324: invokevirtual #115                // Method org/springframework/web/ErrorResponseException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 327: aload         13
         * 329: invokevirtual #116                // Method org/springframework/web/ErrorResponseException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 332: aload_2
         * 333: invokevirtual #117                // Method handleErrorResponseException:(Lorg/springframework/web/ErrorResponseException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 336: areturn
         * 337: new           #121                // class org/springframework/http/HttpHeaders
         * 340: dup
         * 341: invokespecial #123                // Method org/springframework/http/HttpHeaders."<init>":()V
         * 344: astore_3
         * 345: aload_1
         * 346: instanceof    #124                // class org/springframework/beans/ConversionNotSupportedException
         * 349: ifeq          370
         * 352: aload_1
         * 353: checkcast     #124                // class org/springframework/beans/ConversionNotSupportedException
         * 356: astore        4
         * 358: aload_0
         * 359: aload         4
         * 361: aload_3
         * 362: getstatic     #126                // Field org/springframework/http/HttpStatus.INTERNAL_SERVER_ERROR:Lorg/springframework/http/HttpStatus;
         * 365: aload_2
         * 366: invokevirtual #132                // Method handleConversionNotSupported:(Lorg/springframework/beans/ConversionNotSupportedException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 369: areturn
         * 370: aload_1
         * 371: instanceof    #136                // class org/springframework/beans/TypeMismatchException
         * 374: ifeq          395
         * 377: aload_1
         * 378: checkcast     #136                // class org/springframework/beans/TypeMismatchException
         * 381: astore        5
         * 383: aload_0
         * 384: aload         5
         * 386: aload_3
         * 387: getstatic     #138                // Field org/springframework/http/HttpStatus.BAD_REQUEST:Lorg/springframework/http/HttpStatus;
         * 390: aload_2
         * 391: invokevirtual #141                // Method handleTypeMismatch:(Lorg/springframework/beans/TypeMismatchException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 394: areturn
         * 395: aload_1
         * 396: instanceof    #145                // class org/springframework/http/converter/HttpMessageNotReadableException
         * 399: ifeq          420
         * 402: aload_1
         * 403: checkcast     #145                // class org/springframework/http/converter/HttpMessageNotReadableException
         * 406: astore        6
         * 408: aload_0
         * 409: aload         6
         * 411: aload_3
         * 412: getstatic     #138                // Field org/springframework/http/HttpStatus.BAD_REQUEST:Lorg/springframework/http/HttpStatus;
         * 415: aload_2
         * 416: invokevirtual #147                // Method handleHttpMessageNotReadable:(Lorg/springframework/http/converter/HttpMessageNotReadableException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 419: areturn
         * 420: aload_1
         * 421: instanceof    #151                // class org/springframework/http/converter/HttpMessageNotWritableException
         * 424: ifeq          445
         * 427: aload_1
         * 428: checkcast     #151                // class org/springframework/http/converter/HttpMessageNotWritableException
         * 431: astore        7
         * 433: aload_0
         * 434: aload         7
         * 436: aload_3
         * 437: getstatic     #126                // Field org/springframework/http/HttpStatus.INTERNAL_SERVER_ERROR:Lorg/springframework/http/HttpStatus;
         * 440: aload_2
         * 441: invokevirtual #153                // Method handleHttpMessageNotWritable:(Lorg/springframework/http/converter/HttpMessageNotWritableException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 444: areturn
         * 445: aload_1
         * 446: instanceof    #157                // class org/springframework/validation/BindException
         * 449: ifeq          470
         * 452: aload_1
         * 453: checkcast     #157                // class org/springframework/validation/BindException
         * 456: astore        8
         * 458: aload_0
         * 459: aload         8
         * 461: aload_3
         * 462: getstatic     #138                // Field org/springframework/http/HttpStatus.BAD_REQUEST:Lorg/springframework/http/HttpStatus;
         * 465: aload_2
         * 466: invokevirtual #159                // Method handleBindException:(Lorg/springframework/validation/BindException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 469: areturn
         * 470: aload_1
         * 471: athrow
         *  */
        // </editor-fold>
    }
    
    
      @ExceptionHandler(TodoNotFoundException.class)
        public final ResponseEntity<ExceptionResponse> TodoNotFoundException(TodoNotFoundException ex, WebRequest request) throws Exception {
        ExceptionResponse message = new ExceptionResponse(HttpStatus.NOT_FOUND.value(), new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: instanceof    #27                 // class org/springframework/web/HttpRequestMethodNotSupportedException
         * 4: ifeq          27
         * 7: aload_1
         * 8: checkcast     #27                 // class org/springframework/web/HttpRequestMethodNotSupportedException
         * 11: astore_3
         * 12: aload_0
         * 13: aload_3
         * 14: aload_3
         * 15: invokevirtual #29                 // Method org/springframework/web/HttpRequestMethodNotSupportedException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 18: aload_3
         * 19: invokevirtual #33                 // Method org/springframework/web/HttpRequestMethodNotSupportedException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 22: aload_2
         * 23: invokevirtual #37                 // Method handleHttpRequestMethodNotSupported:(Lorg/springframework/web/HttpRequestMethodNotSupportedException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 26: areturn
         * 27: aload_1
         * 28: instanceof    #41                 // class org/springframework/web/HttpMediaTypeNotSupportedException
         * 31: ifeq          58
         * 34: aload_1
         * 35: checkcast     #41                 // class org/springframework/web/HttpMediaTypeNotSupportedException
         * 38: astore        4
         * 40: aload_0
         * 41: aload         4
         * 43: aload         4
         * 45: invokevirtual #43                 // Method org/springframework/web/HttpMediaTypeNotSupportedException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 48: aload         4
         * 50: invokevirtual #44                 // Method org/springframework/web/HttpMediaTypeNotSupportedException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 53: aload_2
         * 54: invokevirtual #45                 // Method handleHttpMediaTypeNotSupported:(Lorg/springframework/web/HttpMediaTypeNotSupportedException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 57: areturn
         * 58: aload_1
         * 59: instanceof    #49                 // class org/springframework/web/HttpMediaTypeNotAcceptableException
         * 62: ifeq          89
         * 65: aload_1
         * 66: checkcast     #49                 // class org/springframework/web/HttpMediaTypeNotAcceptableException
         * 69: astore        5
         * 71: aload_0
         * 72: aload         5
         * 74: aload         5
         * 76: invokevirtual #51                 // Method org/springframework/web/HttpMediaTypeNotAcceptableException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 79: aload         5
         * 81: invokevirtual #52                 // Method org/springframework/web/HttpMediaTypeNotAcceptableException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 84: aload_2
         * 85: invokevirtual #53                 // Method handleHttpMediaTypeNotAcceptable:(Lorg/springframework/web/HttpMediaTypeNotAcceptableException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 88: areturn
         * 89: aload_1
         * 90: instanceof    #57                 // class org/springframework/web/bind/MissingPathVariableException
         * 93: ifeq          120
         * 96: aload_1
         * 97: checkcast     #57                 // class org/springframework/web/bind/MissingPathVariableException
         * 100: astore        6
         * 102: aload_0
         * 103: aload         6
         * 105: aload         6
         * 107: invokevirtual #59                 // Method org/springframework/web/bind/MissingPathVariableException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 110: aload         6
         * 112: invokevirtual #60                 // Method org/springframework/web/bind/MissingPathVariableException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 115: aload_2
         * 116: invokevirtual #61                 // Method handleMissingPathVariable:(Lorg/springframework/web/bind/MissingPathVariableException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 119: areturn
         * 120: aload_1
         * 121: instanceof    #65                 // class org/springframework/web/bind/MissingServletRequestParameterException
         * 124: ifeq          151
         * 127: aload_1
         * 128: checkcast     #65                 // class org/springframework/web/bind/MissingServletRequestParameterException
         * 131: astore        7
         * 133: aload_0
         * 134: aload         7
         * 136: aload         7
         * 138: invokevirtual #67                 // Method org/springframework/web/bind/MissingServletRequestParameterException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 141: aload         7
         * 143: invokevirtual #68                 // Method org/springframework/web/bind/MissingServletRequestParameterException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 146: aload_2
         * 147: invokevirtual #69                 // Method handleMissingServletRequestParameter:(Lorg/springframework/web/bind/MissingServletRequestParameterException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 150: areturn
         * 151: aload_1
         * 152: instanceof    #73                 // class org/springframework/web/multipart/support/MissingServletRequestPartException
         * 155: ifeq          182
         * 158: aload_1
         * 159: checkcast     #73                 // class org/springframework/web/multipart/support/MissingServletRequestPartException
         * 162: astore        8
         * 164: aload_0
         * 165: aload         8
         * 167: aload         8
         * 169: invokevirtual #75                 // Method org/springframework/web/multipart/support/MissingServletRequestPartException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 172: aload         8
         * 174: invokevirtual #76                 // Method org/springframework/web/multipart/support/MissingServletRequestPartException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 177: aload_2
         * 178: invokevirtual #77                 // Method handleMissingServletRequestPart:(Lorg/springframework/web/multipart/support/MissingServletRequestPartException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 181: areturn
         * 182: aload_1
         * 183: instanceof    #81                 // class org/springframework/web/bind/ServletRequestBindingException
         * 186: ifeq          213
         * 189: aload_1
         * 190: checkcast     #81                 // class org/springframework/web/bind/ServletRequestBindingException
         * 193: astore        9
         * 195: aload_0
         * 196: aload         9
         * 198: aload         9
         * 200: invokevirtual #83                 // Method org/springframework/web/bind/ServletRequestBindingException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 203: aload         9
         * 205: invokevirtual #84                 // Method org/springframework/web/bind/ServletRequestBindingException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 208: aload_2
         * 209: invokevirtual #85                 // Method handleServletRequestBindingException:(Lorg/springframework/web/bind/ServletRequestBindingException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 212: areturn
         * 213: aload_1
         * 214: instanceof    #89                 // class org/springframework/web/bind/MethodArgumentNotValidException
         * 217: ifeq          244
         * 220: aload_1
         * 221: checkcast     #89                 // class org/springframework/web/bind/MethodArgumentNotValidException
         * 224: astore        10
         * 226: aload_0
         * 227: aload         10
         * 229: aload         10
         * 231: invokevirtual #91                 // Method org/springframework/web/bind/MethodArgumentNotValidException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 234: aload         10
         * 236: invokevirtual #92                 // Method org/springframework/web/bind/MethodArgumentNotValidException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 239: aload_2
         * 240: invokevirtual #93                 // Method handleMethodArgumentNotValid:(Lorg/springframework/web/bind/MethodArgumentNotValidException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 243: areturn
         * 244: aload_1
         * 245: instanceof    #97                 // class org/springframework/web/servlet/NoHandlerFoundException
         * 248: ifeq          275
         * 251: aload_1
         * 252: checkcast     #97                 // class org/springframework/web/servlet/NoHandlerFoundException
         * 255: astore        11
         * 257: aload_0
         * 258: aload         11
         * 260: aload         11
         * 262: invokevirtual #99                 // Method org/springframework/web/servlet/NoHandlerFoundException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 265: aload         11
         * 267: invokevirtual #100                // Method org/springframework/web/servlet/NoHandlerFoundException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 270: aload_2
         * 271: invokevirtual #101                // Method handleNoHandlerFoundException:(Lorg/springframework/web/servlet/NoHandlerFoundException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 274: areturn
         * 275: aload_1
         * 276: instanceof    #105                // class org/springframework/web/context/request/async/AsyncRequestTimeoutException
         * 279: ifeq          306
         * 282: aload_1
         * 283: checkcast     #105                // class org/springframework/web/context/request/async/AsyncRequestTimeoutException
         * 286: astore        12
         * 288: aload_0
         * 289: aload         12
         * 291: aload         12
         * 293: invokevirtual #107                // Method org/springframework/web/context/request/async/AsyncRequestTimeoutException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 296: aload         12
         * 298: invokevirtual #108                // Method org/springframework/web/context/request/async/AsyncRequestTimeoutException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 301: aload_2
         * 302: invokevirtual #109                // Method handleAsyncRequestTimeoutException:(Lorg/springframework/web/context/request/async/AsyncRequestTimeoutException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 305: areturn
         * 306: aload_1
         * 307: instanceof    #113                // class org/springframework/web/ErrorResponseException
         * 310: ifeq          337
         * 313: aload_1
         * 314: checkcast     #113                // class org/springframework/web/ErrorResponseException
         * 317: astore        13
         * 319: aload_0
         * 320: aload         13
         * 322: aload         13
         * 324: invokevirtual #115                // Method org/springframework/web/ErrorResponseException.getHeaders:()Lorg/springframework/http/HttpHeaders;
         * 327: aload         13
         * 329: invokevirtual #116                // Method org/springframework/web/ErrorResponseException.getStatusCode:()Lorg/springframework/http/HttpStatusCode;
         * 332: aload_2
         * 333: invokevirtual #117                // Method handleErrorResponseException:(Lorg/springframework/web/ErrorResponseException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 336: areturn
         * 337: new           #121                // class org/springframework/http/HttpHeaders
         * 340: dup
         * 341: invokespecial #123                // Method org/springframework/http/HttpHeaders."<init>":()V
         * 344: astore_3
         * 345: aload_1
         * 346: instanceof    #124                // class org/springframework/beans/ConversionNotSupportedException
         * 349: ifeq          370
         * 352: aload_1
         * 353: checkcast     #124                // class org/springframework/beans/ConversionNotSupportedException
         * 356: astore        4
         * 358: aload_0
         * 359: aload         4
         * 361: aload_3
         * 362: getstatic     #126                // Field org/springframework/http/HttpStatus.INTERNAL_SERVER_ERROR:Lorg/springframework/http/HttpStatus;
         * 365: aload_2
         * 366: invokevirtual #132                // Method handleConversionNotSupported:(Lorg/springframework/beans/ConversionNotSupportedException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 369: areturn
         * 370: aload_1
         * 371: instanceof    #136                // class org/springframework/beans/TypeMismatchException
         * 374: ifeq          395
         * 377: aload_1
         * 378: checkcast     #136                // class org/springframework/beans/TypeMismatchException
         * 381: astore        5
         * 383: aload_0
         * 384: aload         5
         * 386: aload_3
         * 387: getstatic     #138                // Field org/springframework/http/HttpStatus.BAD_REQUEST:Lorg/springframework/http/HttpStatus;
         * 390: aload_2
         * 391: invokevirtual #141                // Method handleTypeMismatch:(Lorg/springframework/beans/TypeMismatchException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 394: areturn
         * 395: aload_1
         * 396: instanceof    #145                // class org/springframework/http/converter/HttpMessageNotReadableException
         * 399: ifeq          420
         * 402: aload_1
         * 403: checkcast     #145                // class org/springframework/http/converter/HttpMessageNotReadableException
         * 406: astore        6
         * 408: aload_0
         * 409: aload         6
         * 411: aload_3
         * 412: getstatic     #138                // Field org/springframework/http/HttpStatus.BAD_REQUEST:Lorg/springframework/http/HttpStatus;
         * 415: aload_2
         * 416: invokevirtual #147                // Method handleHttpMessageNotReadable:(Lorg/springframework/http/converter/HttpMessageNotReadableException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 419: areturn
         * 420: aload_1
         * 421: instanceof    #151                // class org/springframework/http/converter/HttpMessageNotWritableException
         * 424: ifeq          445
         * 427: aload_1
         * 428: checkcast     #151                // class org/springframework/http/converter/HttpMessageNotWritableException
         * 431: astore        7
         * 433: aload_0
         * 434: aload         7
         * 436: aload_3
         * 437: getstatic     #126                // Field org/springframework/http/HttpStatus.INTERNAL_SERVER_ERROR:Lorg/springframework/http/HttpStatus;
         * 440: aload_2
         * 441: invokevirtual #153                // Method handleHttpMessageNotWritable:(Lorg/springframework/http/converter/HttpMessageNotWritableException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 444: areturn
         * 445: aload_1
         * 446: instanceof    #157                // class org/springframework/validation/BindException
         * 449: ifeq          470
         * 452: aload_1
         * 453: checkcast     #157                // class org/springframework/validation/BindException
         * 456: astore        8
         * 458: aload_0
         * 459: aload         8
         * 461: aload_3
         * 462: getstatic     #138                // Field org/springframework/http/HttpStatus.BAD_REQUEST:Lorg/springframework/http/HttpStatus;
         * 465: aload_2
         * 466: invokevirtual #159                // Method handleBindException:(Lorg/springframework/validation/BindException;Lorg/springframework/http/HttpHeaders;Lorg/springframework/http/HttpStatusCode;Lorg/springframework/web/context/request/WebRequest;)Lorg/springframework/http/ResponseEntity;
         * 469: areturn
         * 470: aload_1
         * 471: athrow
         *  */
        // </editor-fold>
    }
}
