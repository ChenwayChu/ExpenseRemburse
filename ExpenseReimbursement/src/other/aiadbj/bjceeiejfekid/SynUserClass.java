package other.aiadbj.bjceeiejfekid;/**
 * Created by chenway on 2017/8/23.
 */

import com.rkhd.platform.sdk.ScriptTrigger;
import com.rkhd.platform.sdk.exception.ScriptBusinessException;
import com.rkhd.platform.sdk.model.DataModel;
import com.rkhd.platform.sdk.param.ScriptTriggerParam;
import com.rkhd.platform.sdk.param.ScriptTriggerResult;
import com.rkhd.platform.sdk.log.Logger;
import com.rkhd.platform.sdk.log.LoggerFactory;

import java.util.List;

public class SynUserClass implements ScriptTrigger {
    private static final Logger logger = LoggerFactory.getLogger();

    @Override
    public ScriptTriggerResult execute(ScriptTriggerParam scriptTriggerParam) throws ScriptBusinessException {

        if (scriptTriggerParam != null) {
            List<DataModel> modelList = scriptTriggerParam.getDataModelList();
            if (modelList != null && modelList.size() > 0) {
                for (DataModel dataModel : modelList) {
                    logger.info("用户操作开始");


                    logger.debug("操作执行了");


                    logger.info("用户操作结束");
                }
            }
        } else {
            throw new ScriptBusinessException("scriptTriggerParam is Null");
        }
        ScriptTriggerResult result = new ScriptTriggerResult();
        result.setDataModelList(scriptTriggerParam.getDataModelList());
        return result;
    }
}
