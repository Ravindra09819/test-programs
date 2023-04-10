using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExceptionH
{
    public class MyCustomException : Exception
    {
        public String ErrorCode;
        public String ErrorMessage;
        
        public MyCustomException(String code, String message, String orgExMsg):base(orgExMsg) {
            ErrorCode =  code;
            ErrorMessage = message;
        }
        public MyCustomException(String code, String message) {
            ErrorCode =  code;
            ErrorMessage = message;
        }
    }

}
