/**
 * Created by Break.D on 7/21/16.
 */

function stateChange(obj) {

    var stat = obj.value;

    if (stat == "working") {
        $(".spe_working").css("display", "table-row");
        $(".spe_educate").css("display", "none");
    } else if (stat == "educated") {
        $(".spe_educate").css("display", "table-row");
        $(".spe_working").css("display", "none");
    } else {
        $(".spe_educate").css("display", "none");
        $(".spe_working").css("display", "none");
    }
}