jQuery(window).load(
    function(){
        var wait_loading = window.setTimeout( function(){
          $('#loading').slideUp('fast');
          jQuery('body').css('overflow','auto');
        },1000
    );
});
(function($){
	/**过滤 重复加载**/
	if(!!window.ufo && !!window.ufo.main){return;}
	
    var main = {
    		changeContent : function(url, dataStr){
        		if(dataStr==null)dataStr="";
        		$.ajax({
        			url : url,
        			type : "POST",
        			data : dataStr,
        			dataType : 'html',
        			timeout : 100000,
        			error : function() {
        			},
        			success : function(response) {
        				$("#page-content-wrapper").html(response);
        			}
        		});
    		},
    		initUI : function(){
	        	// 隐藏侧边栏
	        	$('#close-sidebar').click(function(){
	        	    $('body').toggleClass('close-sidebar');
	        	    $(this).toggleClass('hidden');
	        	    $('#rm-close-sidebar').toggleClass('hidden');
	        	    $('#page-sidebar').toggleClass('hidden');
	        	    $('#page-content-wrapper').css('margin-left','0px');
	        	});
	        	// 显示侧边栏
	        	$('#rm-close-sidebar').click(function(){
	        	    $('body').toggleClass('close-sidebar');
	        	    $(this).toggleClass('hidden');
	        	    $('#close-sidebar').toggleClass('hidden');
	        	    $('#page-sidebar').toggleClass('hidden');
	        	    $('#page-content-wrapper').css('margin-left','220px');
	        	});
	        	// 菜单事件
	        	$('.dt-menu').click(function(){
	        		ufo.main.changeContent($(this).attr("href"), "changeDiv");
	                return false;
	        	});
    		}
    };
    /** 命名空间 **/
    $.extend(ufo,{main:main});
    
    window.ufo.main.initUI();
})(jQuery);