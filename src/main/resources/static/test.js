
var option = {
    url: context + "/exception/ajaxError",
    type: "post",
    async: false,
    success: function(data) {
        if (data.status == 200) {
        } else {
            alert(data.msg);
        }
    },
    error: function() {
    }
};

$.ajax(option);