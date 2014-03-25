jQuery(window).load(
    function(){

        var wait_loading = window.setTimeout( function(){
          $('#loading').slideUp('fast');
          jQuery('body').css('overflow','auto');
        },1000
    );
});

$('#close-sidebar').click(function(){
    $('body').toggleClass('close-sidebar');
    $(this).toggleClass('hidden');
    $('#rm-close-sidebar').toggleClass('hidden');
    $('#page-sidebar').toggleClass('hidden');
    $('#page-content-wrapper').css('margin-left','0px');
});

$('#rm-close-sidebar').click(function(){
    $('body').toggleClass('close-sidebar');
    $(this).toggleClass('hidden');
    $('#close-sidebar').toggleClass('hidden');
    $('#page-sidebar').toggleClass('hidden');
    $('#page-content-wrapper').css('margin-left','220px');
});