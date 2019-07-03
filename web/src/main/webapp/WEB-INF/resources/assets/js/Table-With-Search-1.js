//Table with search
$(document).ready(function () {
    $(".search").keyup(function () {
        var searchTerm = $(".search").val();
        var listItem = $('.result').children('figure');
        var searchSplit = searchTerm.replace(/ /g, "'):containsi('");
        $.extend($.expr[':'], {
            'containsi': function (elem, i, match) {
               return (elem.textContent || elem.innerText).toLowerCase().indexOf((match[3]).toLowerCase()) >= 0;
            }
        });

        $(".result figure").not(":containsi('" + searchSplit + "')").each(function () {
            $(this).hide();
        });
       
        $(".result figure:containsi('" + searchSplit + "')").each(function (e) {
            $(this).show();
        });

        var jobCount = $('.snip1563 figcaption p[visible="true"]').length;
        $('.counter').text(jobCount + ' item');
       
        if (jobCount == '0') {
            $('.no-result').show();
        } else {
            $('.no-result').hide();
        }
    });
});